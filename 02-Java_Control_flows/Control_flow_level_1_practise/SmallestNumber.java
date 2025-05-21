import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a<b && a<c){
            System.out.println("First num is the smallest");
        }
        else if (b<a && b<c) {
            System.out.println("Second num is the smallest");
        }
        else{
            System.out.println("Third num is the smallest");
        }

    }
}
