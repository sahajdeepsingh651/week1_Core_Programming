import java.util.*;
class first_practise_problem{
static void answer1(){
System.out.println("Welcome to Bridgelabz");
}

static void add(double a ,double b){
	double c = a + b;
	System.out.println(c);
}
static void temperature_conversion(double c){
	double fahrenheit = (c * 9/5) + 32;
	System.out.println(fahrenheit);
}
static void Area(double radius){
	double area = Math.PI * Math.pow(radius,2);
	System.out.println(area);
}

static void Simple_Interest(double Principal,double Rate,double Time){
	double simple_interest = (Principal*Rate*Time)/100;
	System.out.println(simple_interest);
}
static void Perimeter(double length , double  width){
	double Perimeter = 2 *(length + width);
	System.out.println(Perimeter);
}

static void Power_Calculation(double base,double exponent){
	double power = Math.pow(base,exponent);
	System.out.println(power);
}
static void average(double num1,double  num2,double num3){
	double result = (num1+ num2 + num3)/3;
	System.out.println(result);
}
static void distance_converstion(double kilometers){
	double Miles = kilometers * 0.621371;
	System.out.println(Miles);
}


public static void main (String args[]){
answer1();
Scanner sc = new Scanner(System.in);
System.out.println("Enter your two numbers");
int a = sc.nextInt();
int b = sc.nextInt();

   add(a,b);
System.out.println("Add your fahrenheit temperature");
int c = sc.nextInt();
    temperature_conversion(c);

System.out.println("Enter your Radius");
int radius = sc.nextInt();
      Area(radius);

System.out.println("Enter your Principal,Rate,Time");
int Principal= sc.nextInt();
int Rate = sc.nextInt();
int Time = sc.nextInt();
       Simple_Interest(Principal,Rate,Time);

System.out.println("Enter your Length,Width");
int length = sc.nextInt();
int width = sc.nextInt();
        Perimeter(length,width);
System.out.println("Enter your base ,exponent");		
int base = sc.nextInt();
int exponent = sc.nextInt();


 Power_Calculation(base,exponent);
 System.out.println("Enter your 3 numbers");
 int num1 = sc.nextInt();
  int num2= sc.nextInt();
   int num3 = sc.nextInt();
 average(num1,num2,num3);
  System.out.println("Enter distance in kilometers ");
  int distance = sc.nextInt();
  distance_converstion(distance);
sc.close();
}
}