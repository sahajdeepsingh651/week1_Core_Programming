import java.util.*;
class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to swap: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
		num1 = num1^num2;
		 num2 = num1^num2;
		 num1 = num1^num2; 
		   
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
    }
}