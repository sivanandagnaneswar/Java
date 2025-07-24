import java.util.Scanner;

public class OperatorExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for a and b
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        // Arithmetic Operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b)); // Integer division
        System.out.println("Modulus: " + (a % b));

        // Take user input for c and d
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();
        c++; // c becomes c+1
        System.out.println("Incremented c: " + c);

        System.out.print("Enter value for d: ");
        int d = sc.nextInt();
        --d; // d becomes d-1
        System.out.println("Decremented d: " + d);

        // Logical Operations
        boolean condition1 = (a > b); // true if a > b
        boolean condition2 = (b < 0);  // true if b < 0
        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || condition2));
        System.out.println("Logical NOT of condition1: " + (!condition1));

        sc.close(); // good practice
    }
}


//C:\Java programs\Assignment 1 main\2>java OperatorExamples.java
//Enter value for a: 3
//Enter value for b: 4
//Addition: 7
//Subtraction: -1
//Multiplication: 12
//Division: 0
//Modulus: 3
//Enter value for c: 1
//Incremented c: 2
//Enter value for d: 1
//Decremented d: 0
//Logical AND: false
//Logical OR: false
//Logical NOT of condition1: true
