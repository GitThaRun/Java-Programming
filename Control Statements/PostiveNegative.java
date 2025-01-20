import java.util.*;

public class PostiveNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(+num + " " + "Is a positive number");
        } else if (num < 0) {
            System.out.println(+num + " " + "Is a negative number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
