import java.util.Scanner;
public class IllegalArgument {
    public static void generateexception(String input){
        System.out.println("Attempting to get a substr with invalid indices");
        System.out.println("Substr: "+input.substring(5,2));
    }
    public static void handleexception(String input){
        try{
            System.out.println("Attempting to get a substr with invalid indices");
            System.out.println("Substr: "+input.substring(5,2));
        } catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught! Start index cannot be greater than end index.");
        } catch (Exception e) {
            System.out.println("A general exception occured: "+e);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String txt=sc.nextLine();
        try {
            generateexception(txt);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("\nNow handling the exception properly:\n");
        handleexception(txt);
        sc.close();
    }
}
