import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names, int index) {
        System.out.println("Accessing: " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};

        System.out.print("Enter an index to access (0-2): ");
        int index = scanner.nextInt();

        // generateException(names, index);
        handleException(names, index);
    }
}
