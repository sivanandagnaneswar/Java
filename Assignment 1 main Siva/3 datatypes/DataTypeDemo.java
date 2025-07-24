public class DataTypeDemo {

    // Employee Example
    static class Employee {
        int empId;            // int
        String name;          // String
        double salary;        // double
        char grade;           // char
        boolean isPermanent;  // boolean

        Employee(int empId, String name, double salary, char grade, boolean isPermanent) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
            this.grade = grade;
            this.isPermanent = isPermanent;
        }

        void displayEmployee() {
            System.out.println("----- Employee Details -----");
            System.out.println("ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Grade: " + grade);
            System.out.println("Permanent: " + isPermanent);
        }
    }

    // Bank Account Example
    static class BankAccount {
        long accountNumber;   // long
        String accountHolder; // String
        float balance;        // float
        boolean isActive;     // boolean

        BankAccount(long accountNumber, String accountHolder, float balance, boolean isActive) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.isActive = isActive;
        }

        void displayAccount() {
            System.out.println("----- Bank Account Details -----");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
            System.out.println("Active: " + isActive);
        }
    }

    // Library Book Example
    static class LibraryBook {
        String title;        // String
        String author;       // String
        int pages;           // int
        boolean isIssued;    // boolean
        char section;        // char

        LibraryBook(String title, String author, int pages, boolean isIssued, char section) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.isIssued = isIssued;
            this.section = section;
        }

        void displayBook() {
            System.out.println("----- Library Book Details -----");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Issued: " + isIssued);
            System.out.println("Section: " + section);
        }
    }

    public static void main(String[] args) {
        // 1. Create an Employee object
        Employee emp = new Employee(101, "Alice John", 55000.75, 'A', true);
        
        // 2. Create a BankAccount object
        BankAccount account = new BankAccount(987654321012L, "Alice John", 24500.50f, true);
        
        // 3. Create a LibraryBook object
        LibraryBook book = new LibraryBook("Java Programming", "James Gosling", 450, false, 'C');

        // Display all details
        emp.displayEmployee();
        account.displayAccount();
        book.displayBook();

        // Example of arrays (multiple employees)
        Employee[] employees = {
            new Employee(102, "Bob Smith", 47000.00, 'B', false),
            new Employee(103, "Charlie Brown", 60000.25, 'A', true)
        };

        System.out.println("\n----- Multiple Employees -----");
        for (Employee e : employees) {
            e.displayEmployee();
        }

        // Primitive data types demo
        byte smallNumber = 100;
        short shortValue = 32000;
        int normalInt = 123456;
        long bigNumber = 1234567890123L;
        float floatValue = 12.34f;
        double doubleValue = 12345.6789;
        char symbol = '#';
        boolean flag = true;

        System.out.println("\n----- Primitive Data Types -----");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + normalInt);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + symbol);
        System.out.println("boolean: " + flag);
    }
}


/*
----- Employee Details -----
ID: 101
Name: Alice John
Salary: 55000.75
Grade: A
Permanent: true
----- Bank Account Details -----
Account Number: 987654321012
Account Holder: Alice John
Balance: 24500.5
Active: true
----- Library Book Details -----
Title: Java Programming
Author: James Gosling
Pages: 450
Issued: false
Section: C

----- Multiple Employees -----
----- Employee Details -----
ID: 102
Name: Bob Smith
Salary: 47000.0
Grade: B
Permanent: false
----- Employee Details -----
ID: 103
Name: Charlie Brown
Salary: 60000.25
Grade: A
Permanent: true

----- Primitive Data Types -----
byte: 100
short: 32000
int: 123456
long: 1234567890123
float: 12.34
double: 12345.6789
char: #
boolean: true
*/
