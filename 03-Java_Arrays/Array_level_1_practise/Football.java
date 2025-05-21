import java.util.*;
public class Football {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[11];
        double sum = 0;

        System.out.println("Enter heights: ");
        for (int i = 0; i < 11; i++){
            arr[i] = sc.nextDouble();
        }
        System.out.println("Heights in array: "+Arrays.toString(arr));
        for (int i = 0; i < 11; i++){
            sum += i;
        }
        double mean = sum / 11;
        System.out.println("Mean: "+mean);
    }
}
