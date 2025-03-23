import java.util.Scanner;
public class trig{
	public static double[] calculateTrigonometricFunctions(double angle){
		double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
		return new double[]{sin,cos,tan};
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter angle: ");
		double angle=sc.nextDouble();
		sc.close();
		double[] res=calculateTrigonometricFunctions(angle);
		System.out.printf("Sine(%.2f°) = %.4f%n", angle, res[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, res[1]);
		if (Math.abs(res[1]) < 1e-10) { 
            System.out.printf("Tangent(%.2f°) is undefined%n", angle);
        } else {
            System.out.printf("Tangent(%.2f°) = %.4f%n", angle, res[2]);
        }
	}
}