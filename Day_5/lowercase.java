import java.util.Scanner;
public class lowercase {
    public static String convtolower(String str){
        StringBuilder lower=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            lower.append(ch);
        }
        return lower.toString();
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
        String upper=str.toLowerCase();
        String mupper=convtolower(str);
        boolean issame=cmpstr(upper,mupper);
        System.out.println("\nConverted using built-in method: " + upper);
        System.out.println("Converted using manual method: " + mupper);
        System.out.println("Are both conversions identical? " + issame);
        sc.close();
    }
}

