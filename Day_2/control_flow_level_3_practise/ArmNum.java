import java.util.*;
public class ArmNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        int temp = n, ori = n, sum = 0, c = 0, digit = 0;
        while(temp > 0){
            c++;
            temp /= 10;
        }
        for (int i = 0; i < c; i++){
            digit = n % 10;
            sum += Math.pow(digit, 3);
            n /= 10;
        }
        System.out.println(c);
        System.out.println(sum);
        if(ori == sum){
            System.out.println("Yes, it's an Armstrong number");
        }
        else{
            System.out.println("No, it isn't an Armstrong number");
        }
    }
}
