import java.util.*;

class Factor_8{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if(num > 0 ){
System.out.println("Factors are");
int i = num;
while( i != 0 ){
if(num%i == 0){
System.out.print(i + " " );
}
i--;
}
}
}
}
