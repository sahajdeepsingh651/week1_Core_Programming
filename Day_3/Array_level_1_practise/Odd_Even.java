import java.util.*;
public class Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int size = num/2 + 1;
        double even[] = new double[size], odd[] = new double[size];
        int e = 0, o = 0;
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                even[e] = i;
                e++;
            }
            else{
                odd[o] = i;
                o++;
            }


        }
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));
    }
}
