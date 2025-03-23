import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks in physics, chem and maths: ");
        int p = input.nextInt(), c = input.nextInt(), m = input.nextInt();
        int avg = (p + c + m) / 3;
        int per = avg;
        if (per < 39) {
            System.out.println("The average mark is " + avg + " and grade percentage is " + per + " and remark is Remedial standards");
        } else if (per > 40 && per < 49) {
            System.out.println("The average mark is " + avg + " and grade percentage is " + per + " and remark is Level 1-, too below agency - normalized standards");
        } else if (per > 50 && per < 59) {
            System.out.println("The average mark is " + avg + " and grade percentage is " + per + " and remark is Level 1, well below agency - normalized standards");
        } else if (per > 60 && per < 69) {
            System.out.println("The average mark is " + avg + " and grade percentage is " + per + " and remark is Level 2,  below agency - normalized standards");
        } else if (per > 70 && per < 79) {
            System.out.println("The average mark is " + avg + " and grade percentage is " + per + " and remark is Level 3-, at agency - normalized standards");
        } else {
            System.out.println("The average mark is " + avg + " and grade percentage is " + per + " and remark is Level 4, above agency - normalized standards");
        }
    }
}
