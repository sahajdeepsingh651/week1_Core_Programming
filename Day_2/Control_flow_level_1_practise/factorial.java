import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int fact = n;
        while (fact > 1){

            fact--;
            n*=fact;

        }
        System.out.println("The factorial value is "+n);
    }
}
