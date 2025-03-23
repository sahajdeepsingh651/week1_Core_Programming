import java.util.Scanner;
public class sum_zero_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if(n == 0 || n < 0 ) break;
            sum+=n;

        }
        System.out.println("Sum: "+sum);
    }

}
