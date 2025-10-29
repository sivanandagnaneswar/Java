import java.util.Scanner;

public class ControlStatements_ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-5): ");
        int num = sc.nextInt();

        // if-else
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // for loop - pattern
        System.out.println("Pattern:");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // while loop - countdown
        int count = num;
        System.out.print("Countdown: ");
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // do-while - message at least once
        int temp = 0;
        do {
            System.out.println("Learning Java control statements!");
            temp++;
        } while (temp < 1);

        // switch
        switch (num) {
            case 1:
                System.out.println("One is the beginning.");
                break;
            case 2:
                System.out.println("Two is a pair.");
                break;
            default:
                System.out.println("Nice number choice!");
        }
    }
}