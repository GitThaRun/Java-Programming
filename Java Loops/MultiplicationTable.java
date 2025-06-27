import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to generate its multiplication table:");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + " : ");

        for(int i = 1;i <= 20;i++){
            int result = num * i;

            System.out.println(num + " X " + i + " = " + result);
        }
        sc.close();
    }
}
