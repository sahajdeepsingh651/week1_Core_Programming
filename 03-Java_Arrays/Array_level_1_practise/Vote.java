//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];
        for (int i = 0; i < 10; i++){
            System.out.println("Enter the age: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array of age: "+Arrays.toString(arr));
        for(int i = 0; i < 10; i++){
            if (arr[i] >= 18){
                System.out.println("Age is "+arr[i]+" Valid to vote.");
            }
            else if (arr[i] < 18){
                System.out.println("Age is "+arr[i]+" Cannot vote");
            }
            else{
                System.out.println("Invalid age");
            }
        }
    }
}