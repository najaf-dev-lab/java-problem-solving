import java.util.Scanner;

public class OddCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = input.nextInt();

        System.out.print("Enter end number: ");
        int end = input.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println("Total odd numbers: " + count);
        
        input.close();
    }
}
