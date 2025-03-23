import java.util.*;

class FiveNumbers_2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("Print Negative");
            } else {
                if (arr[i] % 2 == 0) {
                    System.out.println("The number is even");
                } else {
                    System.out.println("The number is odd");
                }
            }
        }

       
        if (arr[0] == arr[4]) {
            System.out.println("They are equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First is greater");
        } else {
            System.out.println("last is greater");
        }

        sc.close(); // Closing scanner to prevent resource leak
    }
}
