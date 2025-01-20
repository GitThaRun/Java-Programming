import java.util.*;

public class UpperOrLower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Any Key");
        char key = sc.next().charAt(0);
        if (key >= 65 && key <= 90) {
            System.out.println("Upper case character");
        } else if (key >= 97 && key < 122) {
            System.out.println("Lower case character");
        } else if (key >= 48 && key <= 57) {
            System.out.println("A Digit");
        } else {
            System.out.println("Special Symbol");
        }
        sc.close();
    }
}
