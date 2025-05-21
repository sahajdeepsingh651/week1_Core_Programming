import java.util.Scanner;
import java.util.Arrays;
public class FactorialProblem {
    public static int[] fact(int n){
        int c=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                c++;
            }
        }
        int fac[]=new int[c];
        int idx=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                fac[idx++]=i;
            }
        }
        return fac;
    }
    public static int sumfac(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static int sumsq(int n){
        int sq = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sq += Math.pow(i,2);
            }
        }
        return sq;
    }
    public static int prod(int n){
        int p = 1;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                p *= i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int res[] = fact(n);
        int s = sumfac(n);
        int squares = sumsq(n);
        int pd = prod(n);
        System.out.println("Array of factors: "+Arrays.toString(res));
        System.out.println("Sum of factors: "+s);
        System.out.println("Sum of squares of factors: "+squares);
        System.out.println("Product of factors: "+pd);
    }
}