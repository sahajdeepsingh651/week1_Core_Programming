import java.util.Scanner;
public class uppercase {
    public static String convtoupper(String str){
        StringBuilder upper=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            upper.append(ch);
        }
        return upper.toString();
    }
    public static boolean cmpstr(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        for (int i=0;i<str1.length();i++){
            if (str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String upper=str.toUpperCase();
        String mupper=convtoupper(str);
        boolean issame=cmpstr(upper,mupper);
        System.out.println("\nConverted using built-in method: " + upper);
        System.out.println("Converted using manual method: " + mupper);
        System.out.println("Are both conversions identical? " + issame);
        sc.close();
    }
}
