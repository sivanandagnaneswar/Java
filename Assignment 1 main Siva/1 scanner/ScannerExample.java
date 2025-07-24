import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        // Consume the remaining newline character after nextInt()
        scanner.nextLine(); 

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // Display the collected information
        System.out.println("Hello, " + name + "! You are " + age + " years old and your favorite color is " + color + ".");

        // Close the scanner to release resources
        scanner.close();
    }
}


//C:\Java programs\Assignment 1 main\1>java ScannerExample.java
//Enter your name: Sivananda Gnaneswar
//Enter your age: 21
//Enter your favorite color: Blue
//Hello, Sivananda Gnaneswar! You are 21 years old and your favorite color is Blue.