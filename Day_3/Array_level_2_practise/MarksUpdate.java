import java.util.*;
class marks_9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

int marks[][] = new int [num][3];

String grade[] = new String[num]; 
int percentage[] = new int[num];

for(int i = 0 ; i < num;i++){

 marks[i][0]  =  sc.nextInt();
 marks[i][1] = sc.nextInt();
marks[i][2] =  sc.nextInt();
if( marks[i][0] < 0){
System.out.println("Enter the postive marks");
marks[i][0]  =  sc.nextInt();
}if( marks[i][1] < 0){
System.out.println("Enter the postive marks");
 marks[i][1] = sc.nextInt();
}
if( marks[i][2] < 0){
System.out.println("Enter the postive marks");
marks[i][2] = sc.nextInt();
}

 percentage[i]=  (marks[i][0] + marks[i][1]+ marks[i][2])/3;
grade[i] = (percentage[i] > 80) ? "A" :
           (percentage[i] > 70 && percentage[i] <= 80) ? "B" :
           (percentage[i] > 60 && percentage[i] <= 70) ? "C" :
           (percentage[i] > 50 && percentage[i] <= 60) ? "D" :
           (percentage[i] > 40 && percentage[i] <= 50) ? "E" : "R";

}
System.out.println(Arrays.toString(percentage));
System.out.println(Arrays.toString(grade));
}
}