import java.util.Random;
public class FootballProblem {
    public static int[] generaterandomht(int s){
        int[] heights=new int[s];
        Random random=new Random();
        for (int i=0;i<s;i++){
            heights[i]=150+random.nextInt(101);
        }
        return heights;
    }
    public static int calcsum(int[] heights){
        int s=0;
        for (int ht:heights){
            s+=ht;
        }
        return s;
    }
    public static double calcmean(int[] heights){
        return (double)calcsum(heights)/heights.length;
    }
    public static int findshortest(int[] heights){
        int shortest=heights[0];
        for (int ht:heights){
            shortest=Math.min(shortest,ht);
        }
        return shortest;
    }
    public static int findtallest(int[] heights){
        int tallest=heights[0];
        for (int ht:heights){
            tallest=Math.max(tallest,ht);
        }
        return tallest;
    }
    public static void main(String[] args){
        int s=11;
        int[] heights=generaterandomht(s);
        for (int ht:heights){
            System.out.println(ht+" ");
        }
        System.out.println();
        System.out.println("Shortest Height: " + findshortest(heights) + " cm");
        System.out.println("Tallest Height: " + findtallest(heights) + " cm");
        System.out.println("Total Height Sum: " + calcsum(heights));
        System.out.println("Mean Height: " + String.format("%.2f", calcmean(heights)) + " cm");
    }
}
