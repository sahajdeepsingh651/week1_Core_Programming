import java.util.*;
class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangular park in meters: ");
        int side1 = sc.nextInt(), side2 = sc.nextInt(), side3 = sc.nextInt();
        int perimeter = side1 + side2 + side3;
        int rounds = 5000 / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
