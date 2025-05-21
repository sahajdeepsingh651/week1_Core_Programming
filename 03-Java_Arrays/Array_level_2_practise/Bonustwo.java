import java.util.*;

class Bonustwo {

public static void main(String args[]){
double salarys[] = new double[10];
int years[] = new int[10];
Scanner sc = new Scanner(System.in);

for(int i = 0 ; i < 10 ; i++){
int salary = sc.nextInt();
int year = sc.nextInt();
if(salary > 0 && year >0){
salarys[i] = salary;
years[i] = year;
}else{
System.out.println("Please enter the valid values");
}


}
double bonuses[] = new double[10];
double  new_salary[] = new double[10];
for(int i = 0 ; i < 10 ; i++){
if(years[i] >= 5){
bonuses[i] = salarys[i]*0.05;

}else{
bonuses[i] = salarys[i]*0.03;
}
new_salary[i] = salarys[i] + bonuses[i];
}


for(int i = 0 ; i < 10 ; i++){
System.out.println("New Salary is" +new_salary[i] + "Old salary is" + salarys[i] + "bonus is" + bonuses[i]);
}



}

}
