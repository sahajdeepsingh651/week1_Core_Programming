import java.util.*;
class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}