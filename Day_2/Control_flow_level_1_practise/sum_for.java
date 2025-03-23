import java.util.Scanner;
public class sum_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int sum = 0;
        int n = sc.nextInt();
        int s = n * (n + 1) / 2;
        for(int i = 1; i <= n; i++){
            sum+=i;
        }
        System.out.println("Sum using formula is "+s+" while the sum using loop is "+sum);

    }
}
