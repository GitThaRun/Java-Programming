import java.util.*;

class AsciiValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char c = sc.next().charAt(0);
        int ascii = (int) c;
        System.out.println("Ascii value of '" + c + "'is:" + ascii);

        sc.close();
    }
}