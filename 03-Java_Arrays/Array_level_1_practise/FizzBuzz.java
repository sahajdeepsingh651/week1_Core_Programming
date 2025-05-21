import java.util.*;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++){
            if (i%3 == 0){
                arr[i] = "Fizz";
            }
            else if(i%5 == 0){
                arr[i] = "Buzz";
            }
            else if(i%3 == 0 && i%5 == 0){
                arr[i] = "FizzBuzz";
            }
            else{
                arr[i] = String.valueOf(i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
