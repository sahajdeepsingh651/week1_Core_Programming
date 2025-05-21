import java.util.Scanner;
public class numchk {
    public static boolean ispositive(int n){
        return n>0;
    }
    public static boolean iseven(int n){
        return n%2==0;
    }
    public static int compare(int n1,int n2){
        if (n1>n2) return 1;
        else if (n1==n2) return 0;
        else return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Enter number: ");
            num[i]=sc.nextInt();
        }
        for (int n:num){
            if (ispositive(n)){
                if (iseven(n)){
                    System.out.println(n+" is Positive and even");
                }
                else{
                    System.out.println(n+" is positive and odd");
                }
            }
            else{
                System.out.println(n+" is negative");
            }
        }
        int res=compare(num[0],num[4]);
        if (res==1) {
            System.out.println(num[0] + " (First) is greater than " + num[4] + " (Last)");
        } else if (res== 0) {
            System.out.println(num[0] + " (First) is equal to " + num[4] + " (Last)");
        } else {
            System.out.println(num[0] + " (First) is less than " + num[4] + " (Last)");
        }

        sc.close();
    }
}
