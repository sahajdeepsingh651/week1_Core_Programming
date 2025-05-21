import java.util.Scanner;

public class Collinear {
    public static boolean iscollinearusingslope(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0) {
            return false;
        }
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    public static boolean iscollinearusingar(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        boolean collinearSlope = iscollinearusingslope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = iscollinearusingar(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Slope Method? " + collinearSlope);
        System.out.println("Collinear using Area Method? " + collinearArea);
        scanner.close();
    }
}