import java.util.*;
class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3;
        double milesFromFeet = yards / 1760;
        System.out.println("The distance in yards is " + yards + " and in miles is " + milesFromFeet);
    }
}


