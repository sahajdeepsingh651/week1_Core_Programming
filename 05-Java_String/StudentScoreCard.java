import java.util.Random;

public class StudentScoreCard {

    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        Random rand = new Random();
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Math
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];
            if (percent >= 90) grades[i] = "A";
            else if (percent >= 80) grades[i] = "B";
            else if (percent >= 70) grades[i] = "C";
            else if (percent >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("S.No\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }
}
