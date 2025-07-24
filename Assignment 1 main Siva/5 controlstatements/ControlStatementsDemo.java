import java.util.Scanner;

public class ControlStatementsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Available books (array)
        String[] books = {"Java Basics", "Python Guide", "Data Structures", "Algorithms 101"};
        boolean[] isBorrowed = new boolean[books.length]; // track borrowed books

        int choice;
        do {
            // MENU (do-while ensures it runs at least once)
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // SWITCH for menu choices
            switch (choice) {

                case 1:
                    System.out.println("\n--- Available Books ---");
                    // FOR loop to display books
                    for (int i = 0; i < books.length; i++) {
                        if (isBorrowed[i]) {
                            continue; // skip borrowed books
                        }
                        System.out.println((i + 1) + ". " + books[i]);
                    }
                    break;

                case 2:
                    System.out.println("\nEnter book number to borrow:");
                    for (int i = 0; i < books.length; i++) {
                        System.out.println((i + 1) + ". " + books[i] + (isBorrowed[i] ? " (Borrowed)" : ""));
                    }
                    int borrowChoice = sc.nextInt();

                    // IF-ELSE for checking conditions
                    if (borrowChoice < 1 || borrowChoice > books.length) {
                        System.out.println("Invalid choice!");
                    } else if (isBorrowed[borrowChoice - 1]) {
                        System.out.println("Sorry! Already borrowed.");
                    } else {
                        isBorrowed[borrowChoice - 1] = true;
                        System.out.println("You borrowed: " + books[borrowChoice - 1]);
                    }
                    break;

                case 3:
                    System.out.println("\nEnter book number to return:");
                    for (int i = 0; i < books.length; i++) {
                        if (!isBorrowed[i]) continue; // only show borrowed books
                        System.out.println((i + 1) + ". " + books[i]);
                    }
                    int returnChoice = sc.nextInt();

                    // NESTED IF for checking conditions
                    if (returnChoice < 1 || returnChoice > books.length) {
                        System.out.println("Invalid choice!");
                    } else {
                        if (!isBorrowed[returnChoice - 1]) {
                            System.out.println("This book was not borrowed.");
                        } else {
                            isBorrowed[returnChoice - 1] = false;
                            System.out.println("You returned: " + books[returnChoice - 1]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Library... Goodbye!");
                    break; // jump out of switch

                default:
                    System.out.println("Invalid menu choice! Try again.");
            }

            // WHILE loop example: ask if user wants to see menu again
            if (choice != 4) {
                System.out.print("\nPress 1 to continue, any other key to exit menu: ");
                int again = sc.nextInt();
                if (again != 1) {
                    break; // exit menu early
                }
            }

        } while (choice != 4); // DO-WHILE keeps menu running at least once

        sc.close();

        // JUMP STATEMENT - return ends the program explicitly
        return;
    }
}



/*
C:\Java programs\Assignment 1 main\5>java ControlStatementsDemo.java

===== LIBRARY MENU =====
1. View Available Books
2. Borrow a Book
3. Return a Book
4. Exit
Enter your choice: 2

Enter book number to borrow:
1. Java Basics
2. Python Guide
3. Data Structures
4. Algorithms 101
1
You borrowed: Java Basics

Press 1 to continue, any other key to exit menu: 1

===== LIBRARY MENU =====
1. View Available Books
2. Borrow a Book
3. Return a Book
4. Exit
Enter your choice: 2

Enter book number to borrow:
1. Java Basics (Borrowed)
2. Python Guide
3. Data Structures
4. Algorithms 101
1
Sorry! Already borrowed.
*/