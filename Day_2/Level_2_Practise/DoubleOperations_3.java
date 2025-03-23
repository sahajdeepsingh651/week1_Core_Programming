import java.util.*;
class DoubleOperations_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three double values: ");
        double da = sc.nextDouble(), db = sc.nextDouble(), dc = sc.nextDouble();
        System.out.println("The results of Double Operations are " + (da + db * dc) + ", " + (da * db + dc) + ", " + (dc + da / db));
    }
}
