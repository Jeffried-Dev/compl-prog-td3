package fr.uvsq.cprog.mvnjunit;

import org.apache.commons.cli.*;

public class GrepApp {
    public static void main(String[] args) {
        GrepReader grepReader = new GrepReader();
        Options options = new Options();
        options.addOption("e", true, "Motif de recherche");
        options.addOption("i", false, "Ignorer la casse");
        options.addOption("f", true, "Lire le motif de recherche depuis un fichier");
        options.addOption("n", false, "Afficher le numéro de ligne");
        options.addOption(Option.builder().longOpt("line-number").desc("Afficher le numéro de ligne").build());
        options.addOption("h", "help", false, "Afficher l'aide");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("GrepReader", options);
                return;
            }

            String searchString = cmd.getOptionValue("e");
            String fileName = cmd.getArgList().get(0);

            if (searchString == null && !cmd.hasOption("f")) {
                System.out.println("Veuillez spécifier un motif de recherche avec l'option -e ou un fichier avec l'option -f.");
                return;
            }

            if (cmd.hasOption("f")) {
                String filePath = cmd.getOptionValue("f");
                searchString = grepReader.getSearchStringFromFile(filePath);
            }

            if (cmd.hasOption("i")) {
                searchString = "(?i)" + searchString;
            }

            grepReader.findAndDisplayMatchingLines(searchString, fileName, cmd.hasOption("n"));
        } catch (ParseException e) {
            System.out.println("Erreur lors de l'analyse des arguments : " + e.getMessage());
        }
    }
}
