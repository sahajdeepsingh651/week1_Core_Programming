import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];

        int length = 0;
        try {
            while (true) {
                char ch = text.charAt(length);
                freq[ch]++;
                length++;
            }
        } catch (Exception e) {
            // reached end of string
        }

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // null character if none found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
