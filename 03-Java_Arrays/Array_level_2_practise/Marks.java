import java.util.*;
class Marks {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();



int physics_marks[] = new int[num];
String grade[] = new String[num]; 
int percentage[] = new int[num];


int chemistry_marks[] = new int[num];


int maths_marks[] = new int[num];



for(int i = 0 ; i < num;i++){
physics_marks[i]  =  sc.nextInt();
 chemistry_marks[i] = sc.nextInt();
maths_marks[i] =  sc.nextInt();
if( physics_marks[i] < 0){
System.out.println("Enter the postive marks");
physics_marks[i]  =  sc.nextInt();
}if( chemistry_marks[i] < 0){
System.out.println("Enter the postive marks");
 chemistry_marks[i] = sc.nextInt();
}
if( maths_marks[i] < 0){
System.out.println("Enter the postive marks");
maths_marks[i] = sc.nextInt();
}

 percentage[i]=  (maths_marks[i] + chemistry_marks[i]+ maths_marks[i])/3;
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