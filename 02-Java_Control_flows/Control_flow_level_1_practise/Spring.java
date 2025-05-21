import java.util.Scanner;
public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month and date: ");
        int month = sc.nextInt(), date = sc.nextInt();
        if (month < 1 || month > 12 || date < 1 || date > 31) {
            System.out.println("Invalid month or date. Please enter a valid date.");
        }
        else if ((month == 3 && date >= 20 ) ||
                (month >3 && month <=6) ||
                (month == 6 && date <= 20)){
            System.out.println("Yes! It's a spring season");
        }

        else{
            System.out.println("No, it isn't a spring season");
        }
    }
}
