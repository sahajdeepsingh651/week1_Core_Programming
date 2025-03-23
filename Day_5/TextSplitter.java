import java.util.Scanner;
public class TextSplitter {
    public static String[] splitText(String text) {
        String[] words = new String[100];
        String currentWord = "";
        int wordIndex = 0;

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else if (!currentWord.equals("")) {
                words[wordIndex++] = currentWord;
                currentWord = "";
            }
        }
        if (!currentWord.equals("")) {
            words[wordIndex++] = currentWord;
        }

        String[] finalWords = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) {
            finalWords[i] = words[i];
        }

        return finalWords;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void displayResult(String[][] wordInfo) {
        System.out.println("Word\t\tLength");
        System.out.println("------------------------");
        for (int i = 0; i < wordInfo.length; i++) {
            int length = Integer.parseInt(wordInfo[i][1]);
            System.out.println(wordInfo[i][0] + "\t\t" + length);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordInfo = getWordLengths(words);
        displayResult(wordInfo);
    }
}
