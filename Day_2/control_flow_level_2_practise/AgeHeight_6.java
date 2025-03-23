import java.util.Scanner;

class AgeHeight_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking age input
        System.out.println("Enter ages of Amar, Akbar, and Anthony:");
        int amar_age = sc.nextInt();
        int akbar_age = sc.nextInt();
        int anthony_age = sc.nextInt();
        
        // Finding the youngest friend
        int youngest = Math.min(amar_age, Math.min(akbar_age, anthony_age));
        String youngest_name = (youngest == amar_age) ? "Amar" : (youngest == akbar_age) ? "Akbar" : "Anthony";
        
        // Taking height input
        System.out.println("Enter heights of Amar, Akbar, and Anthony:");
        int amar_height = sc.nextInt();
        int akbar_height = sc.nextInt();
        int anthony_height = sc.nextInt();
        
        // Finding the tallest friend
        int tallest = Math.max(amar_height, Math.max(akbar_height, anthony_height));
        String tallest_name = (tallest == amar_height) ? "Amar" : (tallest == akbar_height) ? "Akbar" : "Anthony";
        
        // Displaying results
        System.out.println("The youngest friend is " + youngest_name + " with age " + youngest);
        System.out.println("The tallest friend is " + tallest_name + " with height " + tallest);
        
        sc.close();
    }
}
