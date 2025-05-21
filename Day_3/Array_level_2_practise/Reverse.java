import java.util.*;
class reverse_5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int num = sc.nextInt();
int size = (int)(Math.log10(num) + 1 );
int reverse_array[] = new int[size];
for(int i = 0 ; i < size; i++){
reverse_array[i] = num %10;
num = num/10;
}
System.out.println("Reverse number in array:");

System.out.println(Arrays.toString(reverse_array));
}
}