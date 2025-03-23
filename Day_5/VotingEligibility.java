import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;  // ensures 2-digit age from 10 to 99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        int n = ages.length;
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Age\tCan Vote?");
        System.out.println("-----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] votingStatus = checkVotingEligibility(ages);
        displayTable(votingStatus);
    }
}
