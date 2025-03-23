import java.util.Scanner;

public class length {
    public static int length_of_string(String s) {
        int count = 0;
        while (true) {
            // Check if accessing index goes out of bounds
            if (count >= s.lastIndexOf("")) { // Detect when count reaches the last valid index
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();

        int len_str = length_of_string(s);

        System.out.println("Length using custom method: " + len_str);
        sc.close(); // Close scanner
    }
}
