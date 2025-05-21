import java.util.Arrays;
import java.util.Scanner;
public class NumberCheckPartTwo {
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
    public static int sumofdigits(int num) {
        int[] digits=getdigitsarr(num);
        int s=0;
        for (int dig:digits) {
            s+=dig;
        }
        return s;
    }
    public static int sumofsquaresofdig(int num) {
        int[] digits=getdigitsarr(num);
        int s=0;
        for (int dig : digits) {
            s+=Math.pow(dig,2);
        }
        return s;
    }
    public static boolean isharshadnum(int num) {
        int s=sumofdigits(num);
        return num%s== 0;
    }
    public static int[][] digitfreq(int num) {
        int[] digits = getdigitsarr(num);
        int[][] freq = new int[10][2];
        for (int i=0;i<10;i++) {
            freq[i][0]=i; // Store digit
        }

        for (int digit : digits) {
            freq[digit][1]++; // Count frequency
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Number of digits: " + countdigits(num));
        System.out.println("Digits: " + Arrays.toString(getdigitsarr(num)));
        System.out.println("Sum of digits: " + sumofdigits(num));
        System.out.println("Sum of squares of digits: " + sumofsquaresofdig(num));
        System.out.println("Is Harshad number? " + isharshadnum(num));

        int[][] frequency = digitfreq(num);
        System.out.println("Digit Frequency:");
        for (int i=0; i<10;i++) {
            if (frequency[i][1]>0) {
                System.out.println("Digit "+frequency[i][0]+ ": "+frequency[i][1] + " times");
            }
        }
        sc.close();
    }
}
