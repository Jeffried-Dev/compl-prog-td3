package fr.uvsq.cprog.mvnjunit;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class GrepReaderTest {
//    @Test
//    public void testCountLines() {
//        GrepReader grepReader = new GrepReader();
//        assertEquals(4, grepReader.countLines("C:\\Users\\nouad\\Documents\\Paris Saclay\\M1 AMIS\\SEM 1\\PROG\\TD.txt"));
//    }
//    @Test
//    public void testFindAndDisplayLines() {
//        GrepReader grepReader = new GrepReader();
//        String result = grepReader.findAndDisplayLines("Hello","C:\\Users\\nouad\\Documents\\Paris Saclay\\M1 AMIS\\SEM 1\\PROG\\TD.txt");
//        assertEquals("Ligne 1: Hello, world!\nLigne 3: Hello boy\n", result);
//    }
//
//    @Test
//    public void testMatchingLines() {
//        String searchString = "Hello";
//        String fileName = "C:\\Users\\nouad\\Documents\\Paris Saclay\\M1 AMIS\\SEM 1\\PROG\\TD.txt"; // Assure-toi d'avoir un fichier de test avec des lignes contenant "Hello"
//        String expectedOutput = "Ligne 1: Hello, world!\nLigne 3: Hello boy\n";
//        // Capture la sortie console pour la comparer à la sortie attendue
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayLines(searchString, fileName);
//        System.out.println(expectedOutput);
//        System.out.println(outputStream.toString());
//        String actualOutput = outputStream.toString();
//        assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    public void testSingleLineMatch() {
//        String searchString = "test";
//        String fileName = "C:\\Users\\nouad\\Documents\\Paris Saclay\\M1 AMIS\\SEM 1\\PROG\\TD.txt"; // Fichier de test contenant une ligne avec "test"
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayLines(searchString, fileName);
//
//        String expectedOutput = "Ligne 1: test\n";
//        String actualOutput = outputStream.toString();
//        assertEquals(expectedOutput, actualOutput.trim());
//    }
//
//    @Test
//    public void testMultipleMatchesInLine() {
//        String searchString = "test";
//        String fileName = "findAndDisplayLines"; // Fichier de test contenant une ligne avec plusieurs occurrences de "test"
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayMatchingLines(searchString, fileName, true);
//
//        String expectedOutput = "Ligne 1: This is a test, a test indeed.\n";
//        String actualOutput = outputStream.toString();
//        assertEquals(expectedOutput, actualOutput.trim());
//    }
//
//    @Test
//    public void testMultipleLinesMatch() {
//        String searchString = "test";
//        String fileName = "C:\\Users\\nouad\\Documents\\Paris Saclay\\M1 AMIS\\SEM 1\\PROG\\TD.txt"; // Fichier de test contenant plusieurs lignes avec "test"
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayLines(searchString, fileName);
//
//        String expectedOutput = "Ligne 1: This test was a success.\nLigne 2: Success comes with hard work.\n";
//        String actualOutput = outputStream.toString();
//        assertEquals(expectedOutput, actualOutput.trim());
//    }
//
//    @Test
//    public void testNonExistentFile() {
//        String searchString = "test";
//        String fileName = "nonExistentFile.txt"; // Fichier inexistant
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayLines(searchString, fileName);
//
//        String actualOutput = outputStream.toString();
//        assertTrue(actualOutput.isEmpty());
//    }
//
//    @Test
//    public void testEmptyOrNullSearchString() {
//        String searchString = "";
//        String fileName = "C:\\Users\\nouad\\Documents\\Paris Saclay\\M1 AMIS\\SEM 1\\PROG\\TD.txt"; // Fichier de test avec des lignes
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayLines(searchString, fileName);
//
//        String actualOutput = outputStream.toString();
//        assertTrue(actualOutput.isEmpty());
//    }
//
//    @Test
//    public void testUnauthorizedFileAccess() {
//        String searchString = "test";
//        String fileName = "/etc/passwd"; // Fichier système protégé
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayMatchingLines(searchString, fileName, true);
//
//        String actualOutput = outputStream.toString();
//        assertTrue(actualOutput.isEmpty());
//    }
//
//    @Test
//    public void testNoMatchInFile() {
//        String searchString = "test#";
//        String fileName = "C:\\Users\\nouad\\Documents\\Paris Saclay\\M1 AMIS\\SEM 1\\PROG\\TD.txt"; // Fichier de test sans le motif recherché
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        GrepReader.findAndDisplayMatchingLines(searchString, fileName, true);
//
//        String actualOutput = outputStream.toString();
//        assertTrue(actualOutput.isEmpty());
//    }
}