import java.util.Scanner;

public class Chart {
    public static char[] arr1(String txt){
        int l=txt.length();
        char[] arr1=new char[l];
        for (int i=0;i<l;i++){
            arr1[i]=txt.charAt(i);
        }
        return arr1;
    }
    public static boolean cmparr(char[] charr1,char[] charr2){
        if (charr1.length != charr2.length){
            return false;
        }
        for (int i=0;i<charr1.length;i++){
            if (charr1[i]!=charr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt=sc.next();
        char charr1[]=arr1(txt);
        char charr2[]=txt.toCharArray();
        boolean res=cmparr(charr1,charr2);
        System.out.println("Are both equal"+(res?"Yes":"No"));
        sc.close();
    }
}
