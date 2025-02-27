//import java.io.*;
//
// class FileTest {
//    public static void main(String[] args) {
//        // Create File objects for input and output files
//        File inputFile = new File("input.txt");
//        File outputFile = new File("output.txt");
//
//        BufferedReader bufferedReader = null;
//        BufferedWriter bufferedWriter = null;
//
//        try {
//            // Initialize BufferedReader to read from input.txt
//            FileReader fileReader = new FileReader(inputFile);
//            bufferedReader = new BufferedReader(fileReader);
//
//            // Read the two integers from input.txt
//            String line = bufferedReader.readLine();
//            int num1 = Integer.parseInt(line);
//
//            line = bufferedReader.readLine();
//            int num2 = Integer.parseInt(line);
//
//            // Calculate the sum of the two numbers
//            int sum = num1 + num2;
//
//            // Initialize BufferedWriter to write to output.txt
//            FileWriter fileWriter = new FileWriter(outputFile);
//            bufferedWriter = new BufferedWriter(fileWriter);
//
//            // Write the sum to output.txt
//            bufferedWriter.write("The sum is: " + sum);
//
//            System.out.println("Sum written to output.txt successfully.");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found: " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading or writing files: " + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid number format in input file: " + e.getMessage());
//        } finally {
//            try {
//                // Close the streams if they are open
//                if (bufferedReader != null) bufferedReader.close();
//                if (bufferedWriter != null) bufferedWriter.close();
//            } catch (IOException e) {
//                System.out.println("An error occurred while closing the streams: " + e.getMessage());
//            }
//        }
//    }
//}
