import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int s = n*(n+1)/2;
        if(n >= 0){
            System.out.println("The num is a natural number and the sum of "+n+" natural numbers is "+s);
        }
        else{
            System.out.println("The number "+n+" is not a natural num");
        }

    }
}
