import java.util.*;
class TravelComputation {
   
   public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

      String name = "Eric";
       System.out.println("Enter fromCity , ViaCity and toCity")c;
      String fromCity = sc.next(), viaCity = sc.next(), toCity = sc.next();
	  System.out.println("Enter your distanceFromToVia and distanceViaToFinalCity");



      double distanceFromToVia = sc.nextDouble();
 
  double distanceViaToFinalCity = sc.nextDouble();
  System.out.println("Enter your timeFromToVia and  timeViaToFinalCity");
      int timeFromToVia = sc.nextInt();

    

      
      int timeViaToFinalCity = sc.nextInt();

      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      int totalTime = timeFromToVia + timeViaToFinalCity;

      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
