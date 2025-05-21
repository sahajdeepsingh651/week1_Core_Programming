
class PensDivided {
	public static void main(String args[]){
	int pen_num = 14;
	int student_num = 3;
	int remaning_pens = pen_num %student_num;
	
	int pen_per_student = pen_num/student_num;
	System.out.println("The Pen Per Student is "+ pen_per_student + "and the remaining pen not distributed is " + remaning_pens);
	
		
	}
}