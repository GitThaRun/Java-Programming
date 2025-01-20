import java.util.*;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle:");
        int p = sc.nextInt();
        System.out.println("Enter Time:");
        int t = sc.nextInt();
        System.out.println("Enter Rate:");
        float r = sc.nextFloat();

        double SI;
        SI = p * t * r / 100;
        System.out.println("The Simple interest is:" + SI);
        sc.close();
    }
}
