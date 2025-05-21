 import java.util.*;
 class Bmisecond {
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of persons");
 int num = sc.nextInt();
 int weight[] = new int[num];
 int height[] = new int[num];
 double bmi[]  = new double[num];
 String weight_Status[] = new String[num];
 for(int i = 0 ; i < num ; i++){
 System.out.println("Enter person height");
 height[i] = sc.nextInt();
 System.out.println("Enter person weight");
 weight[i] = sc.nextInt();
 bmi[i] = weight[i]/(height[i]*height[i]*1.0);
weight_Status[i] = (bmi[i] <= 18.4)? "Underweight" : (bmi[i] > 24.9 && bmi[i] > 18.5) ? "Normal":(bmi[i] > 39.9 && bmi[i] > 25) ? "Overweight":(bmi[i] >= 40.0)?"Obese":" invalid";

 }
  System.out.println("Height " + Arrays.toString(height));
  System.out.println("Weight " +Arrays.toString(weight));
   System.out.println("bmi "+Arrays.toString(bmi));
    System.out.println("weight_Status " + Arrays.toString(weight_Status));
 }
 }