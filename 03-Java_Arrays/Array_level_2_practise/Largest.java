import java.util.*;
class Largest {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int num = sc.nextInt();
int  maxDigit[] = new int[10];
int index = 0 ;
while(num != 0){
maxDigit[index] = num%10;
num = num/10;
index++;
}System.out.println(Arrays.toString(maxDigit));
int largest = Integer.MIN_VALUE;
int second_largest = Integer.MIN_VALUE;
for(int i = 0 ; i< maxDigit.length;i++){
if(maxDigit[i]> largest){
	second_largest = largest;
largest = maxDigit[i];

}else if(maxDigit[i] > second_largest){
second_largest = maxDigit[i];
}


}
System.out.println("The largest number is " + largest);
System.out.println("The second_largest is" + second_largest);

}
}