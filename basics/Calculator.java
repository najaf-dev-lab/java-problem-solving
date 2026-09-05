import java.util.Scanner;

public class Calculator {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        
        System.out.println("======Calculator Menu=====!");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square of Number");
        System.out.println("6. Cube of Number");
        System.out.println("========================");
        

        System.out.print("Enter Choice: ");

        int choice = input.nextInt();
        if(choice == 1) {

            System.out.print("Enter First Number: ");
            num1 = input.nextInt();

            System.out.print("Enter Second Number: ");
            num2 = input.nextInt();

            System.out.println("Sum = " + (num1 + num2));
        }
        else if(choice == 2){
            System.out.print("Enter First Number: ");
            num1 = input.nextInt();

            System.out.print("Enter Second Number: ");
            num2 = input.nextInt();

            System.out.println("Subtract = " + (num1 - num2));
        }
        else if(choice == 3){
             System.out.print("Enter First Number: ");
            num1 = input.nextInt();

            System.out.print("Enter Second Number: ");

            num2 = input.nextInt();
            System.out.println("Multiplication = " + (num1 * num2));
        }
        else if(choice == 4){
            System.out.print("Enter First Number: ");
            num1 = input.nextInt();

            System.out.print("Enter Second Number: ");
            num2 = input.nextInt();

            System.out.println("Division = " + (num1 / num2));
            System.out.println("Remainder = " + (num1 % num2));
        }
        else if(choice == 5){
            System.out.print("Enter The Number: ");
            num1 = input.nextInt();

            System.out.println("Square of give Number is = " + (num1*num1));
        }
        else if(choice == 6){
            System.out.print("Enter The Number: ");
            num1 = input.nextInt();
            
            System.out.println("Cube of given Number is = " + (num1*num1*num1));
        }
        else{

            System.out.println("Invalid Choice");
        }

        input.close();
    }
}
