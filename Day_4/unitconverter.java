import java.util.Scanner;
public class unitconverter {
    public static double convertktm(double km){
        double km2mi=0.621371;
        return km*km2mi;
    }
    public static double convertmtk(double mi){
        double mi2km=1.60934;
        return mi*mi2km;
    }
    public static double convertmtf(double me){
        double me2fe=3.28084;
        return me*me2fe;
    }
    public static double convertftm(double fe){
        double fe2me=0.3048;
        return fe*fe2me;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Unit Converter:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose an option (1-4): ");
        int ch=input.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = input.nextDouble();
        double res=0;
        switch (ch) {
            case 1:
                res = convertktm(value);
                System.out.printf("%.2f km = %.2f miles%n", value, res);
                break;
            case 2:
                res = convertmtk(value);
                System.out.printf("%.2f miles = %.2f km%n", value, res);
                break;
            case 3:
                res = convertmtf(value);
                System.out.printf("%.2f meters = %.2f feet%n", value, res);
                break;
            case 4:
                res = convertftm(value);
                System.out.printf("%.2f feet = %.2f meters%n", value, res);
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}
