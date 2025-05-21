import java.util.*;
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of persons: ");
        double n = sc.nextInt();
        double h = 0, w = 0, b = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Enter height of person "+(i+1)+" in m: ");
            h = sc.nextDouble();
            System.out.println("Enter weight of person "+(i+1)+" in kg: ");
            w = sc.nextDouble();
            b =  w / (Math.pow(h, 2));
            System.out.println("BMI of person "+(i+1)+" is: "+b);
            if (b <= 18.4){
                System.out.println("Status : Underweight");
            }
            else if (b >= 18.5 && b <= 24.9){
                System.out.println("Status: Normal");
            }
            else if (b >= 25.0 && b <= 39.9){
                System.out.println("Status : Overweight");
            }
            else{
                System.out.println("Obese");
            }
        }


    }
}
