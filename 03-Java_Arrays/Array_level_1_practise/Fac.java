import java.util.*;
public class Fac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int max_fac = 10;

        int arr[] = new int[max_fac];
        for (int i = 1; i < num; i++){
            if (num%i == 0){
                arr[i-1] = i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
