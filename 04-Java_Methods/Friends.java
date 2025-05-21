import java.util.Scanner;
public class Friends {
    public static String findyoung(String[] names,int[] ages){
        int minage=ages[0];
        int youidx=0;
        for (int i=0;i<ages.length;i++){
            if (ages[i]<minage){
                minage=ages[i];
                youidx=i;
            }
        }
        return names[youidx];
    }
    public static String findtall(String[] names,double[] h){
        double tall=h[0];
        int talidx=0;
        for (int i=0;i< h.length;i++){
            if (h[i]>tall){
                tall=h[i];
                talidx=i;
            }
        }
        return names[talidx];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        double[] h=new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            h[i] = sc.nextDouble();
        }
        String youngest=findyoung(names,ages);
        String tallest=findtall(names,h);
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
        sc.close();
    }
}
