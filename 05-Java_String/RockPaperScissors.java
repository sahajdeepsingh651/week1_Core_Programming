import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.34) return "rock";
        else if (rand < 0.67) return "paper";
        else return "scissors";
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock")) return computer.equals("scissors") ? "User" : "Computer";
        if (user.equals("paper")) return computer.equals("rock") ? "User" : "Computer";
        if (user.equals("scissors")) return computer.equals("paper") ? "User" : "Computer";
        return "Invalid";
    }

    public static String[][] calculateStats(String[][] gameData, int totalGames) {
        int userWins = 0, compWins = 0;
        for (int i = 0; i < totalGames; i++) {
            if (gameData[i][2].equals("User")) userWins++;
            else if (gameData[i][2].equals("Computer")) compWins++;
        }

        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100) / totalGames) + "%";

        return stats;
    }

    public static void displayResults(String[][] gameData, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("User\tComputer\tWinner");
        System.out.println("----------------------------------");
        for (int i = 0; i < gameData.length; i++) {
            System.out.println(gameData[i][0] + "\t" + gameData[i][1] + "\t\t" + gameData[i][2]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Player\tWins\tWin%");
        System.out.println("--------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many games do you want to play? ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[][] gameData = new String[totalGames][3];

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = determineWinner(userChoice, compChoice);

            gameData[i][0] = userChoice;
            gameData[i][1] = compChoice;
            gameData[i][2] = winner;
        }

        String[][] stats = calculateStats(gameData, totalGames);
        displayResults(gameData, stats);
    }
}
