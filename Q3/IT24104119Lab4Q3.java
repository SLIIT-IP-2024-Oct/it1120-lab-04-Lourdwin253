import java.util.Scanner;

public class IT24104119Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Determine if the number is Positive, Negative, or Zero using a ternary operator
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        // Display the result
        System.out.println("The number is: " + result);
    }
}