import java.util.Scanner;

class OddEven_1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
for(int i = 1 ; i <= num ; i++){
if(i%2 == 0 ){
System.out.println(i + " is even");
}
else{
System.out.println(i+ " is odd");
}
}
}
}