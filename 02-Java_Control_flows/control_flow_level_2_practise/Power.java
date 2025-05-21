import java.util.*;
class Power {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number and power");
int num = sc.nextInt();
int power = sc.nextInt();
sc.close();
int result = 1;
while(power != 0){
result *= num;
power--;
}
System.out.println("Result is "+ result);
}
}