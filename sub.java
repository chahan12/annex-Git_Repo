import java.util.Scanner;

<<<<<<< Updated upstream
public class SubtractionWithScanner {
=======
public class SubtractionWithStaticVariables {

    // Static variables to store the numbers
    private static int num1;
    private static int num2;

    // Method to perform subtraction
    public static int subtractNumbers() {
        return num1 - num2;
    }
>>>>>>> Stashed changes

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first number
        System.out.print("Enter the first number: ");
<<<<<<< Updated upstream
        int num1 = scanner.nextInt();

        // Taking input for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
=======
        num1 = scanner.nextInt();

        // Taking input for the second number
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
>>>>>>> Stashed changes

        // Closing the Scanner to avoid resource leakage
        scanner.close();

<<<<<<< Updated upstream
        // Performing subtraction
        int difference = num1 - num2;
=======
        // Calling the method to subtract two numbers
        int difference = subtractNumbers();
>>>>>>> Stashed changes

        // Displaying the result
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
    }
}
