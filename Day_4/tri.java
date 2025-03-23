import java.util.Scanner;
public class tri{
	public double rounds(double a,double b,double c){
		double peri=a+b+c;
		double ro=5/peri;
		return ro;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter side 1: ");
		double s1=input.nextDouble();
		System.out.print("Enter side 2: ");
		double s2=input.nextDouble();
		System.out.print("Enter side 3: ");
		double s3=input.nextDouble();
		tri obj=new tri();
		double rounds=obj.rounds(s1,s2,s3);
		System.out.print("Total rounds: "+rounds);
	}
}