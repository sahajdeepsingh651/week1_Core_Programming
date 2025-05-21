import java.util.*;


class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates and number of children: ");
        int chocolates = sc.nextInt(), children = sc.nextInt();
        System.out.println("The number of chocolates each child gets is " + (chocolates / children) + " and the number of remaining chocolates are " + (chocolates % children));
    }
}

