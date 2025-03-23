import java.util.*;
class student_age_1{
public static void main(String args[]){
int arr[] = new int [10];
Scanner sc = new Scanner(System.in);
for(int i = 0 ; i <10 ; i++){
int num = sc.nextInt();
arr[i] = num;
} 


for(int i = 0 ; i < arr.length;i++){
if(arr[i]< 0){
System.out.println("Invalid Age ");
}
if(arr[i] < 18){
System.out.println("The student with the age"+ arr[i]+ " cannot vote");
}
else{
System.out.println("The student with the age"+ arr[i]+ " can vote");
}
}
}}
