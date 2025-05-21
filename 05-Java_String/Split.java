import java.util.Scanner;
public class Split {
    public static int getstrlen(String text){
        int c=0;
        try{
            while (true){
                text.charAt(c);
                c++;
            }
        } catch (IndexOutOfBoundsException e){
            return c;
        }
    }
    public static String[] customsplit(String text){
        int len=getstrlen(text);
        int wc=1;
        for (int i=0;i<len;i++){
            if (text.charAt(i)==' '){
                wc++;
            }
        }
        int[] spaceidx=new int[wc-1];
        int idx=0;
        for (int i=0;i<len;i++){
            if (text.charAt(i)==' '){
                spaceidx[idx++]=i;
            }
        }
        String[] words=new String[wc];
        int start=0;
        for (int i=0;i<wc;i++){
            int end=(i<spaceidx.length)?spaceidx[i]:len;
            words[i]=text.substring(start,end);
            start=end+1;
        }
        return words;
    }
    public static boolean cmparr(String[] arr1,String[] arr2){
        if (arr1.length!=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if (!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text=sc.nextLine();
        String[] builtinsplit=text.split(" ");
        String[] customsplitres=customsplit(text);
        System.out.println("Built-in split result: ");
        for (String word : builtinsplit) {
            System.out.print(word + " | ");
        }
        System.out.println();
        System.out.println("Custom split result: ");
        for (String word : customsplitres) {
            System.out.print(word + " | ");
        }
        System.out.println();
        boolean isEqual = cmparr(builtinsplit, customsplitres);
        System.out.println("Are both methods equal? " + isEqual);
        sc.close();
    }
}
