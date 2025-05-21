import java.util.Scanner;
public class Sum {
	public static int sumn(int n){
		int s=n*(n+1)/2;
		return s;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int sum=sumn(num);
		System.out.print("Sum: "+sum);
	}
}