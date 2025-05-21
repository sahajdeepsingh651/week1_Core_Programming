import java.util.*;
public class max_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[10];
        double sum = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextDouble();
            if (arr[i] == 0 || arr[i] < 0){
                break;
            }
            else{
                sum += arr[i];
            }


        }
        System.out.println("Sum: "+sum);



    }
}
