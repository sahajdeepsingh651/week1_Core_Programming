import java.util.Scanner;

public class BmiCalculator {

    public static double[][] takeInput(int people) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[people][2];
        for (int i = 0; i < people; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        return data;
    }

    public static String[] calculateBmiStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(bmi), status};
    }

    public static String[][] processBmi(double[][] input) {
        String[][] result = new String[input.length][4];
        for (int i = 0; i < input.length; i++) {
            double weight = input[i][0];
            double height = input[i][1];
            String[] bmiStatus = calculateBmiStatus(weight, height);
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiStatus[0];
            result[i][3] = bmiStatus[1];
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1] + "\t\t" + table[i][2] + "\t\t" + table[i][3]);
        }
    }

    public static void main(String[] args) {
        int people = 10;
        double[][] data = takeInput(people);
        String[][] output = processBmi(data);
        displayTable(output);
    }
}
