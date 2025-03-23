import java.util.*;

class TotalIncome_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary and bonus: ");
        int salary = sc.nextInt(), bonus = sc.nextInt();
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + (salary + bonus));
    }
}
