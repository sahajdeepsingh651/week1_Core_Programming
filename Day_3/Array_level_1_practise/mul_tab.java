import java.util.Scanner;
public class mul_tab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int arr[] = new int[10];
        for (int i = 6; i <= 9; i++) {
            arr[i] = num * i;
            System.out.println(num + " * " + (i) + " = " + arr[i]);

        }
    }
}