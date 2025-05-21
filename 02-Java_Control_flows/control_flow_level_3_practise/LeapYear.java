import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Invalid year");
        } else if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Not a leap yr");
        } else {
            System.out.println("Not a leap yr");
        }
    }
}