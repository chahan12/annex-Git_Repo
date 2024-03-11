import java.util.Scanner;

public class SubtractionWithScanner {

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Taking input for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Closing the Scanner to avoid resource leakage
        scanner.close();

        // Performing subtraction
        int difference = num1 - num2;

        // Displaying the result
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
    }
}
