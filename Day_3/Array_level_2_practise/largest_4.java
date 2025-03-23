import java.util.*;

class LargestDigits {
    public static int size(int number) {
        if (number == 0) return 1;
        return (int) (Math.log10(Math.abs(number)) + 1); 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        sc.close(); 

        int numSize = size(num);
        int maxDigit[] = new int[numSize]; 

        int index = 0;
        int tempNum = num; 
        while (tempNum != 0) {
            maxDigit[index++] = tempNum % 10;
            tempNum /= 10;
        }

        System.out.println("Digits extracted: " + Arrays.toString(maxDigit));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numSize; i++) {
            if (maxDigit[i] > largest) {
                secondLargest = largest;
                largest = maxDigit[i];
            } else if (maxDigit[i] > secondLargest && maxDigit[i] != largest) {
                secondLargest = maxDigit[i];
            }
        }

        System.out.println("The largest digit is: " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest digit found (all digits are the same).");
        } else {
            System.out.println("The second largest digit is: " + secondLargest);
        }
    }
}
