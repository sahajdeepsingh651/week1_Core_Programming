import java.util.*;
public class Harshad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int s = 0, temp = n;
        while(temp > 0){
            int d = temp % 10;
            s += d;
            temp /= 10;
        }
        if (n % s == 0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not a harshad number");
        }

    }
}
