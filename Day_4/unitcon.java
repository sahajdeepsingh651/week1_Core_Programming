import java.util.Scanner;
public class unitcon {
    public static double convertftc(double fah){
        return (fah-32)*5/9;
    }
    public static double convertptk(double pou){
        return pou*0.453592;
    }
    public static double convertktp(double kg){
        return kg*2.20462;
    }
    public static double convertctf(double cel){
        return (cel*9/5)+32;
    }
    public static double convertgtl(double gal){
        return gal*3.78541;
    }
    public static double convertltg(double lit){
        return lit*0.264172;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unit Converter:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Choose an option (1-6): ");
        int ch=sc.nextInt();
        System.out.print("Enter the value to convert: ");
        double value=sc.nextDouble();
        double res=0;
        switch (ch) {
            case 1:
                res=convertftc(value);
                System.out.printf("%.2f°F = %.2f°C%n",value,res);
                break;
            case 2:
                res=convertctf(value);
                System.out.printf("%.2f°C = %.2f°F%n",value,res);
                break;
            case 3:
                res=convertptk(value);
                System.out.printf("%.2f lbs = %.2f kg%n",value,res);
                break;
            case 4:
                res=convertktp(value);
                System.out.printf("%.2f kg = %.2f lbs%n",value,res);
                break;
            case 5:
                res=convertgtl(value);
                System.out.printf("%.2f gallons = %.2f liters%n",value,res);
                break;
            case 6:
                res=convertltg(value);
                System.out.printf("%.2f liters = %.2f gallons%n",value,res);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
