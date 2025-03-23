import java.util.*;
class basic_calculator_11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        if (number2 != 0) {
            System.out.println("Division: " + (number1 / number2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
