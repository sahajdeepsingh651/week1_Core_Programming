import java.util.Arrays;
import java.util.Scanner;
public class numchk4 {
    public static int countdigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getdigitsarr(int num) {
        String numstr = String.valueOf(num);
        int[] digits=new int[numstr.length()];
        for (int i=0;i < numstr.length(); i++) {
            digits[i]=Character.getNumericValue(numstr.charAt(i));
        }
        return digits;
    }
    public static int[] rev(int[] digits){
        int[] rev=new int[digits.length];
        for (int i=0;i<digits.length;i++){
            rev[i]=digits[digits.length-1-i];
        }
        return rev;
    }
    public static boolean areeql(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1,arr2);
    }
    public static boolean ispalin(int num){
        int[] digits=getdigitsarr(num);
        int[] rev=rev(digits);
        return areeql(digits,rev);
    }
    public static boolean isduck(int n){
        String numstr=String.valueOf(n);
        return numstr.contains("0") && numstr.charAt(0)!='0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Number of digits: " + countdigits(n));
        System.out.println("Digits: " + Arrays.toString(getdigitsarr(n)));
        System.out.println("Reversed Digits: " + Arrays.toString(rev(getdigitsarr(n))));
        System.out.println("Is Palindrome? " + ispalin(n));
        System.out.println("Is Duck Number? " + isduck(n));
        sc.close();
    }
}
