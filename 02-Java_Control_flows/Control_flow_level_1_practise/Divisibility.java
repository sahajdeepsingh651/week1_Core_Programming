import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        if(n%7 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
