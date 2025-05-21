import java.util.Scanner;

public class YoungestAndTallestUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

     
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

    
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }


        double maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }


        System.out.println("The youngest friend is " + names[youngestIndex] + " with " + minAge + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with " + maxHeight + " cm height.");
        
        scanner.close();
    }
}
