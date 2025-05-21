import java.util.Scanner;
public class WindSpeed {
	public static double calculatewindchill(double temp,double windsp){
		return 35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(windsp,0.16);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temp in F: ");
		double temp=sc.nextDouble();
		System.out.print("Enter wind speed in mph: ");
		double windsp=sc.nextDouble();
		sc.close();
		if (temp<=50 && windsp>=3){
			double windchill=calculatewindchill(temp,windsp);
			System.out.printf("Wind chill temp: %.2fF%n",windchill);
		}
		else{
			System.out.println("Invalid temp and windspeeds");
		}
	}
}