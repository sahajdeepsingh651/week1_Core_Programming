import java.util.Scanner;
class bonus_2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your salary and year");
int salary = sc.nextInt();
int year = sc.nextInt();

if(year > 5){
System.out.println(salary *0.05 +" is the bonus" );
}
else{
System.out.println("There is no bonus");
}
}
}