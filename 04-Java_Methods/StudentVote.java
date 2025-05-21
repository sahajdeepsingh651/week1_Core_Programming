import java.util.Scanner;
public class StudentVote {
    public static boolean canstudvote(int age){
        if (age<0){
            return false;
        }
        return age>=18;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] studages=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Enter age for student: ");
            studages[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            boolean canVote = canstudvote(studages[i]);
            if (studages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + ": Eligible to vote");
            } else {
                System.out.println("Student " + (i + 1) + ": Not eligible to vote");
            }
        }
        sc.close();
    }
}
