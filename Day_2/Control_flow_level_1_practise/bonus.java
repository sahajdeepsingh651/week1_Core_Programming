import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary and year of service: ");
        int salary = sc.nextInt(), ser_yr = sc.nextInt();
        int bonus_amt = salary * 5 / 100;
        int new_sal = 0;
        if (ser_yr > 5) {
            new_sal = salary + bonus_amt;
            System.out.println("The bonus amount is " + bonus_amt + " and the new salary is " + new_sal);
        } else {
            System.out.println("Service year is less");
        }
    }
}
