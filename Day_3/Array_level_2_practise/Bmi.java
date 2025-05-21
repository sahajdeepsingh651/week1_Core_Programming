 import java.util.*;
 class BMI_7{
	
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of persons");
 int num = sc.nextInt();
 double [][] persondata = new double[num][3];
 
 String weight_Status[] = new String[num];
 for(int i = 0 ; i < num ; i++){
 System.out.println("Enter person height");
 persondata[i][0] = sc.nextInt();
 System.out.println("Enter person weight");
persondata[i][1] = sc.nextInt();
persondata[i][2] = persondata[i][0]/(persondata[i][0]*persondata[i][0]*1.0);

weight_Status[i] = (persondata[i][2] <= 18.4)? "Underweight" : (persondata[i][2] > 24.9 && persondata[i][2] > 18.5) ? "Normal":(persondata[i][2] > 39.9 && persondata[i][2] > 25) ? "Overweight":(persondata[i][2] >= 40.0)?"Obese":" invalid";
System.out.println("Height ,Weight and bmi of a person " +Arrays.toString(persondata[i]));
 

 }
  
    System.out.println("weight_Status " + Arrays.toString(weight_Status));
 }
 }