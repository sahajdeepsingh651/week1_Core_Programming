import java.util.*;
class Multiple {
public static void main(String args[]){
 System.out.print("Enter a number: ");
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();
 System.out.print("multiples are");
for(int i = 1 ; i <=100/num ; i++){
System.out.println(num * i );
}
}
}