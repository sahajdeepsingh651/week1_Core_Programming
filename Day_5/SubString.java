import java.util.Scanner;
public class substrcmp {
    public static String createsubstrusingcharat(String txt,int start,int end){
        StringBuilder sb=new StringBuilder();
        for (int i=start;i<end;i++){
            sb.append(txt.charAt(i));
        }
        return sb.toString();
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
        System.out.print("Enter the main string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String substr1=createsubstrusingcharat(text,start,end);
        String substr2=text.substring(start,end);
        boolean areeql=cmpstr(substr1,substr2);
        System.out.println("\nSubstring using charat: "+substr1);
        System.out.println("Substr using substring: "+substr2);
        System.out.println(areeql? "Both are same":"Both are different");
        sc.close();
    }
}
