import java.util.Scanner;

public class MultiplicationTable_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 6 and 9: ");
        
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num >= 6 && num <= 9) {
                System.out.println("Multiplication table of " + num + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
            } else {
                System.out.println("Please enter a number between 6 and 9.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer between 6 and 9.");
        }
        scanner.close();
    }
}
