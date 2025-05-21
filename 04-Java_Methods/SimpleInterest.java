import java.util.Scanner;
public class SimpleInterest {
	public double simint(double pri,double rate,double time){
		double si=pri*rate*time/100;
		return si;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the amount: ");
		double pri=input.nextDouble();
		System.out.print("Enter the rate: ");
		double rate=input.nextDouble();
		System.out.print("Enter the time: ");
		double time=input.nextDouble();
		SimpleInterest obj=new SimpleInterest();
		double simple=obj.simint(pri,rate,time);
		System.out.println("SI: "+simple);
	}
}