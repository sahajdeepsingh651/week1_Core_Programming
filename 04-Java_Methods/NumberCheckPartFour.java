import java.util.Scanner;
public class NumberCheckPartFour {
    public static int[] getdigitsarr(int num) {
        String numstr = String.valueOf(num);
        int[] digits=new int[numstr.length()];
        for (int i=0;i < numstr.length(); i++) {
            digits[i]=Character.getNumericValue(numstr.charAt(i));
        }
        return digits;
    }
    public static boolean isprime(int n){
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isneon(int n){
        int tmp=n*n;
        int s=0;
        while (tmp>0){
            s+=tmp%10;
            tmp/=10;
        }
        return s==n;
    }
    public static boolean isspy(int[] digits){
        int s=0,p=1;
        for (int digit:digits){
            s+=digit;
            p*=digit;
        }
        return p==s;
    }
    public static boolean isautomor(int n){
        int square=n*n;
        String numstr=String.valueOf(n);
        String squarestr=String.valueOf(square);
        return squarestr.endsWith(numstr);
    }
    public static boolean isbuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Is Prime? " + isprime(num));
        System.out.println("Is Neon Number? " + isneon(num));
        System.out.println("Is Spy Number? " + isspy(getdigitsarr(num)));
        System.out.println("Is Automorphic? " + isautomor(num));
        System.out.println("Is Buzz Number? " + isbuzz(num));
        scanner.close();
    }
}
