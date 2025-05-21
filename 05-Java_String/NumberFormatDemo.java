import java.util.Scanner;
public class NumberFormatDemo {
    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }
    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to parse: ");
        String userInput = scanner.nextLine();
        handleException(userInput);
    }
}
