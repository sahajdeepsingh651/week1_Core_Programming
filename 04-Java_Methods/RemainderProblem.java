import java.util.Scanner;
public class RemainderProblem {
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int q=number/divisor;
		int r=number%divisor;
		return new int[]{q,r};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1=input.nextInt();
		System.out.print("Enter a divisor: ");
		int num2=input.nextInt();
		int[] arr=findRemainderAndQuotient(num1,num2);
		int q=arr[0];
		int r=arr[1];
		System.out.println("Quotient: "+q);
		System.out.println("Remainder: "+r);		
	}
}