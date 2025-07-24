import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoScannerExample {
    public static void main(String[] args) {
        // Create a BufferedReader to read from standard input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user for input
            System.out.print("Enter your city: ");
            String city = reader.readLine(); // Read a line of text

            // Display the collected information
            System.out.println("You live in " + city + ".");

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the reader
                }
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}

//C:\Java programs\Assignment 1 main\1>java NoScannerExample.java
//Enter your city: Madurai
//You live in Madurai.