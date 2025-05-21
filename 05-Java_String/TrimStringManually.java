import java.util.Scanner;

public class TrimStringManually {

    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = getLength(text) - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        int lenA = getLength(a);
        int lenB = getLength(b);

        if (lenA != lenB) return false;

        for (int i = 0; i < lenA; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String text = scanner.nextLine();

        int[] indices = findTrimIndices(text);
        String manuallyTrimmed = customSubstring(text, indices[0], indices[1]);
        String builtinTrimmed = text.trim();

        System.out.println("Manually Trimmed: '" + manuallyTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtinTrimmed + "'");

        boolean isEqual = compareStrings(manuallyTrimmed, builtinTrimmed);
        System.out.println("Do both match? " + isEqual);
    }
}
