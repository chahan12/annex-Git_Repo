import java.util.Scanner;

public class AdditionWithScanner {

    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Taking input for the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Closing the Scanner to avoid resource leakage
        scanner.close();

        // Calling the method to add two numbers
        int sum = addNumbers(number1, number2);

        // Displaying the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
