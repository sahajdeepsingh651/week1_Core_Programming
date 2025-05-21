import java.util.*;
public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements");
        for (int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements: "+Arrays.toString(arr));
        for (int i = 0; i < 5; i++){
            if (arr[i] > 0){
                if (arr[i] % 2 == 0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            } else if (arr[i] == 0) {
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }
        }
    }
}
