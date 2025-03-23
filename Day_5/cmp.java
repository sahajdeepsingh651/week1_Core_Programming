import java.util.Scanner;
public class cmp {
    public static boolean cmp(String a,String b){
        if (a.length()!=b.length()){
            return false;
        }
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter str1: ");
        String a=sc.next();
        System.out.print("Enter str2: ");
        String b=sc.next();
        System.out.println(cmp(a,b)? "Both strings are same":"Both are not same");
    }
}
