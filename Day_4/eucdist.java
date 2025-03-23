import java.util.Scanner;

public class eucdist {
    public static double finddist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findeqn(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new ArithmeticException("Vertical line - Undefined slope!");
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        double distance = finddist(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);
        try {
            double[] equation = findeqn(x1, y1, x2, y2);
            System.out.printf("Equation of Line: y = %.2fx + %.2f%n", equation[0], equation[1]);
        } catch (ArithmeticException e) {
            System.out.println("Equation of Line: Vertical Line (x = " + x1 + ")");
        }
        scanner.close();
    }
}