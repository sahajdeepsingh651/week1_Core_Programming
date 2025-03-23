import java.util.Scanner;
public class mul_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = num * (i+1);
            System.out.println(num+" * "+(i+1)+" = "+arr[i]);
        }

    }

}
