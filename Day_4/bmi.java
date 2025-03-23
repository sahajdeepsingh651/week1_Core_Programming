import java.util.Scanner;
public class bmi {
    public static double calcbmi(double w,double h){
        double hm=h/100;
        return w/(hm*hm);
    }
    public static String getbmistat(double bmi){
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal Weight";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmidata = new double[10][3];
        String[] bmistat = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            bmidata[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            bmidata[i][1] = sc.nextDouble();
            bmidata[i][2] = calcbmi(bmidata[i][0], bmidata[i][1]);
            bmistat[i] = getbmistat(bmidata[i][2]);
        }
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), bmidata[i][0], bmidata[i][1], bmidata[i][2], bmistat[i]);
        }
        sc.close();
    }
}