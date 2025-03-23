import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int c = 0;
        if(n > 0){
            for (int i = 2; i * i <= n; i++){
                if (n % i == 0){
                    c++;
                    break;
                }
            }

        }
        else{
            c = 1;
        }
        if (c == 0){

            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" not a prime");
        }
    }
}