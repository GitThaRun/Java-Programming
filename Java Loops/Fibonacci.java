import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Upto Sequence: ");
        int num = sc.nextInt();

        int a = 0,b = 1;

        System.out.print("Fibonnaci sequence : " + a + " " + b + " ");

        for(int i = 3;i <= num;i++){
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        sc.close();
    }
}
