import java.util.Scanner;

public class CharFrequency {

    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256];
        int length = 0;

        try {
            while (true) {
                char ch = text.charAt(length);
                freq[ch]++;
                length++;
            }
        } catch (Exception e) {
            // End of string reached
        }

        boolean[] visited = new boolean[256];
        String[][] result = new String[length][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
            }
        }

        // Resize the array to only include valid entries
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void displayResult(String[][] freqArray) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.printf("    %s     |     %s\n", freqArray[i][0], freqArray[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String[][] frequencyArray = findCharFrequency(input);
        displayResult(frequencyArray);
    }
}
