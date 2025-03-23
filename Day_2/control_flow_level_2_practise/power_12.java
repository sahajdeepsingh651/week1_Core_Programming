import java.util.*;
class power_12{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number and power");
int num = sc.nextInt();
int power = sc.nextInt();
sc.close();
int result = 1;

for(int i = 0 ; i < power;i++){
result *= num;
}


System.out.println("Result is "+ result);
}
}