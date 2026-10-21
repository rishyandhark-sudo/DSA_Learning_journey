
import java.util.Scanner;

class Calculator {

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        return a / b;
    }

    double average(int a, int b) {
        return (a + b) / 2.0;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        int choice;
        int a, b;

        while (true) {

            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Average");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Enter a valid choice!");
                continue;
            }

            System.out.print("Enter first number: ");
            a = sc.nextInt();

            System.out.print("Enter second number: ");
            b = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Addition: " + c.addition(a, b));
                    break;

                case 2:
                    System.out.println("Subtraction: " + c.subtraction(a, b));
                    break;

                case 3:
                    System.out.println("Multiplication: " + c.multiplication(a, b));
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        System.out.println("Division: " + c.division(a, b));
                    }
                    break;

                case 5:
                    System.out.println("Average: " + c.average(a, b));
                    break;
            }
        }

        sc.close();
    }
}
