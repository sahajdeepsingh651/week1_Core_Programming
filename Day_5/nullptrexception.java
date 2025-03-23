public class nullptrexception {
    public static void generateexception(){
        String txt=null;
        System.out.println(txt.length());
    }
    public static void handleexception(){
        try{
            String txt=null;
            System.out.println(txt.length());
        } catch (NullPointerException e){
            System.out.println("Nullpointer exception caught!Cant call methods.");
        }
    }
    public static void main(String[] args){
        try{
            generateexception();
        } catch (Exception e) {
            System.out.println("Exception occured: "+e);
        }
        System.out.println("\nNow handling the exception properly:\n");
        handleexception();
    }
}
