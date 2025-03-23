import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int temp = n, c = 0;
        while(temp > 0){
            c++;
            temp /= 10;
        }
        System.out.println("Count of the given number is: "+c);
    }
}
