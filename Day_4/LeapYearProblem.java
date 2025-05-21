import java.util.Scanner;
public class leap {
    public static boolean isleap(int yr){
        if (yr<1582){
            return false;
        }
        return (yr%4==0 && yr%100!=0)||(yr%400==0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        sc.close();
        if (isleap(year)){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
