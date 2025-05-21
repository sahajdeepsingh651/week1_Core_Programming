import java.util.Scanner;
public class SmallestLargest {
	public static int[] sl(int a,int b,int c){
		int lar=a,sma=a;
		if (b>lar){
			lar=b;
		}
		if (c>lar){
			lar=c;
		}
		if (b<sma){
			sma=b;
		}
		if (c<sma){
			sma=c;
		}
		return new int[]{lar,sma};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1=input.nextInt();
		System.out.print("Enter a number: ");
		int num2=input.nextInt();
		System.out.print("Enter a number: ");
		int num3=input.nextInt();
		int[] res=sl(num1,num2,num3);
		int l=res[0];
		int s=res[1];
		System.out.print("Largest: "+l);
		System.out.print("Smallest: "+s);
	}
}