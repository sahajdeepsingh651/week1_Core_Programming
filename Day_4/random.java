import java.util.Random;
public class random {
    public static int[] generate4digit(int s){
        int[] num=new int[s];
        Random random=new Random();
        for (int i=0;i<s;i++){
            num[i]=1000+random.nextInt(9000);
        }
        return num;
    }
    public static double[] findavgminmax(int[] num){
        int min=num[0],max=num[0],sum=0;
        for (int n:num){
            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        double avg=(double) sum/num.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        int size=5;
        int[] randomnumbers=generate4digit(size);
        for (int n : randomnumbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        double[] res=findavgminmax(randomnumbers);
        System.out.println("Average: " + res[0]);
        System.out.println("Minimum: " + (int) res[1]);
        System.out.println("Maximum: " + (int) res[2]);
    }
}
