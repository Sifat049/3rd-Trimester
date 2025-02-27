package Fall23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsonantCounter {
    public static void main(String[] args) {
        String inputFileName = "src/input.txt";  // Input file path
        String outputFileName = "src/output.txt";  // Output file path

        int consonantCount = 0;

        // Reading from input file and counting consonants
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert to lowercase for consistency
                line = line.toLowerCase();

                // Iterate through each character in the line
                for (char c : line.toCharArray()) {
                    if (isConsonant(c)) {
                        consonantCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the input file: " + e.getMessage());
        }

        // Writing consonant count to the output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {
            bw.write(String.valueOf(consonantCount));
            System.out.println("Consonant count " + consonantCount + " has been written to " + outputFileName);
        } catch (IOException e) {
            System.out.println("Error writing to the output file: " + e.getMessage());
        }
    }

    // Helper method to check if a character is a consonant
    private static boolean isConsonant(char c) {
        // Check if the character is a letter but not a vowel
        return c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1;
    }
}
