import java.util.Scanner;

public class UniqueCharFrequency {

    public static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index] = current;
                index++;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static String[][] getCharFrequencies(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void displayResult(String[][] array) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("    %s     |     %s\n", array[i][0], array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String[][] result = getCharFrequencies(input);
        displayResult(result);
    }
}
