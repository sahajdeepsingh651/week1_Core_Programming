import java.util.*;
class Frequency {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the element");
int num = sc.nextInt();
int frequency_array[] = new int[10];
int lastdigit = 0;
while(num != 0){
lastdigit = num%10;
frequency_array[lastdigit]++;
num = num/10;
}

for(int i = 0 ; i < frequency_array.length;i++){
	if(frequency_array[i] > 0 ){
			System.out.println( "Element is " + i + " Frequency of element is " +frequency_array[i]);

	}
}
}
}