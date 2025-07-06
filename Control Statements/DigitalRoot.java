import java.util.Scanner;
public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int DigitalRoot = (num == 0)? 0 : 1 + (num - 1) % 9;
        System.out.println("Digital Root : " +DigitalRoot);

        sc.close();
    }
}
