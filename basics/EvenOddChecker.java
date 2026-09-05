import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        // Close the scanner
        input.close();
    }
} 
