import java.util.Scanner;
public class posneg{
	public static int pone(int n){
		if (n<0){
			return -1;
		}
		else if (n>0){
			return 1;
		}
		else {
		return 0;
		}	
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		int a=pone(n);
		System.out.print(a);
	}
}