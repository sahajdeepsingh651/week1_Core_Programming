import java.util.Scanner;
public class UniteConversionProblem {
    public static double convertytf(double yar){
        return yar*3;
    }
    public static double convertfty(double fee){
        return fee*0.333333;
    }
    public static double convertmti(double met){
        return met*39.3701;
    }
    public static double convertitm(double inc){
        return inc*0.0254;
    }
    public static double convertitc(double inc){
        return inc*2.54;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unit converter:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Choose an option (1-5): ");
        int ch = sc.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        double res = 0;
        switch (ch) {
            case 1:
                res= convertytf(value);
                System.out.printf("%.2f yards = %.2f feet%n",value,res);
                break;
            case 2:
                res= convertfty(value);
                System.out.printf("%.2f feet = %.2f yards%n",value,res);
                break;
            case 3:
                res= convertmti(value);
                System.out.printf("%.2f meters = %.2f inches%n",value,res);
                break;
            case 4:
                res= convertitm(value);
                System.out.printf("%.2f inches = %.2f meters%n",value,res);
                break;
            case 5:
                res= convertitc(value);
                System.out.printf("%.2f inches = %.2f centimeters%n",value,res);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}