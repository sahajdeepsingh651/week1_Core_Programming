import java.util.Scanner;
public class stridxoutofbndexception {
    public static void generateoutofbnd(String txt){
        System.out.println("Attempting to access invalid index.");
        System.out.println("Character at index 100: "+txt.charAt(100));
    }
    public static void handleexception(String txt){
        try{
            System.out.println("Attempting to access invalid index.");
            System.out.println("Character at index 100: "+txt.charAt(100));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException caught! Index is out of range.");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt=sc.nextLine();
        try{
            generateoutofbnd(txt);
        } catch (Exception e){
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("\nNow handling the exception properly:\n");
        handleexception(txt);
        sc.close();
    }
}
