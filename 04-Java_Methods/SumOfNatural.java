import java.util.*;
public class SumOfNatural {
    public static int Sum_Nat(int n){
        if(n == 0){
            return 0;
        }
        return n + Sum_Nat(n-1);
    }

    public static int nat_form(int n){
        return (n*(n+1)/2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int nat = Sum_Nat(n);
        int nf = nat_form(n);

        if (nf == nat){
            System.out.println("Values from both the methods are equal");
        }
        System.out.println("Sum of natural numbers using formula: "+nf);
        System.out.println("Sum of natural numbers using recursion: "+nat);
    }
}