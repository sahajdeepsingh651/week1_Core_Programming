import java.util.Scanner;
public class NumberCheckPartFive {
    public static int[] getfac(int num){
        int c=0;
        for (int i=1;i<=num;i++){
            if (num%i==0) c++;
        }
        int[] factors=new int[c];
        int idx=0;
        for (int i=1;i<=num;i++){
            if (num%i==0) factors[idx++]=i;
        }
        return factors;
    }
    public static int greatestfac(int num){
        int[] factors=getfac(num);
        return (factors.length>1)?factors[factors.length-2]:1;
    }
    public static int sumoffac(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }
    public static long productoffac(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }
    public static long productofcube(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isperfectnum(int num) {
        int sum = sumoffac(getfac(num)) - num;
        return sum == num;
    }
    public static boolean isabundantnum(int num) {
        int sum = sumoffac(getfac(num)) - num;
        return sum > num;
    }
    public static boolean isdeficientnum(int num) {
        int sum = sumoffac(getfac(num)) - num;
        return sum < num;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    public static boolean isstrongnum(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] factors = getfac(num);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Greatest Factor: " + greatestfac(num));
        System.out.println("Sum of Factors: " + sumoffac(factors));
        System.out.println("Product of Factors: " + productoffac(factors));
        System.out.println("Product of Cube of Factors: " + productofcube(factors));
        System.out.println("Is Perfect Number? " + isperfectnum(num));
        System.out.println("Is Abundant Number? " + isabundantnum(num));
        System.out.println("Is Deficient Number? " + isdeficientnum(num));
        System.out.println("Is Strong Number? " + isstrongnum(num));
        scanner.close();
    }
}
