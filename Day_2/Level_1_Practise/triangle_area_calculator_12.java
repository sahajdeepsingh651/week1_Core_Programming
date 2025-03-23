import java.util.*;
class triangle_area_calculator_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;
        System.out.println("Area of the triangle: " + areaCm + " square cm and " + areaInches + " square inches.");
    }
}
