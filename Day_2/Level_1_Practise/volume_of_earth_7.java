import java.util.*;
class volume_of_earth_7{
	public static void main(String args[]){
	int radius_kilometer = 6378;
double radius_in_miles = 6378 * 1.6;
	double volume_in_miles =   (4/3)* Math.PI * Math.pow(radius_in_miles,3);
	double volume_in_kilometer =  (4/3)* Math.PI* Math.pow(radius_kilometer,3);
		System.out.println("The volume of earth in cubic kilometers is " + volume_in_kilometer + " and cubic miles is " + volume_in_miles);
	}
}