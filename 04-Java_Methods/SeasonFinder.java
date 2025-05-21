import java.util.Scanner;
public class SeasonFinder {
	public static boolean ss(int month,int day){
		if (month==3 && day>19){
			return true;
		}
		else if (month==6 && day<21){
			return true;
		}
		else if (month==4||month==5){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month=input.nextInt();
		System.out.print("Enter the day: ");
		int day=input.nextInt();
		boolean a=ss(month,day);
		System.out.print(a);
	}
}