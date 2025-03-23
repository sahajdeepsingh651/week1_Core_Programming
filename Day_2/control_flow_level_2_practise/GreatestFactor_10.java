import java.util.Scanner;

class GreatestFactor_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

    
        int greatestFactor = 1;
		int i = number;
		while(i != 0 ){
		     if (number % i == 0) { 
                greatestFactor = i;
                break;
            }
			i--;
		}

        for (int i = number - 1; i >= 1; i--) {

        }

        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        sc.close();
    }
}