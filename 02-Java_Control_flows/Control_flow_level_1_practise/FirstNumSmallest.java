import java.util.Scanner;
public class FirstNumSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a<b && a<c){
            System.out.println("Yes! First num is the smallest");
        }
        else{
            System.out.println("No, first num isn't the smallest");
        }
    }
}
