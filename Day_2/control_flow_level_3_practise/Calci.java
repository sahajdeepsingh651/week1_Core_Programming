import java.util.Scanner;
public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of operations: ");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.println("Enter the first number: ");
            double first = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double second = sc.nextDouble();

            System.out.println("Enter the operator (+, -, *, /): ");
            String op = sc.next();

            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
                    break;
            }
        }


    }
}

