import java.util.Scanner;
public class choco{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int q=number/divisor;
		int r=number%divisor;
		return new int[]{q,r};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of chocolates: ");
		int num1=input.nextInt();
		System.out.print("Enter number of children: ");
		int num2=input.nextInt();
		int[] arr=findRemainderAndQuotient(num1,num2);
		int q=arr[0];
		int r=arr[1];
		System.out.println("Number of chocolates each child gets: "+q);
		System.out.println("Remaining chocolates: "+r);		
	}
}