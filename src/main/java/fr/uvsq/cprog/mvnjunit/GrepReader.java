package fr.uvsq.cprog.mvnjunit;

//import org.apache.commons.cli.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GrepReader {

    public static int countLines(String fileName) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public static String findAndDisplayLines(String searchString, String fileName) {
        int lineNum = 1;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile(searchString);
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    stringBuilder.append("Ligne ").append(lineNum).append(": ").append(line).append("\n");
                }
                lineNum++;
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }


    public static String getSearchStringFromFile(String filePath) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = fileReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void findAndDisplayMatchingLines(String searchString, String fileName, boolean showLineNumbers) {
        int lineNum = 1;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile(searchString);
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    if (showLineNumbers) {
                        System.out.print("Ligne " + lineNum + ": ");
                    }
                    System.out.println(line);
                }
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}