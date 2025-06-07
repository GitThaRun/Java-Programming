import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;
        int NDigits = 0;

        while (num > 0) {
            num /= 10;
            NDigits++;
        }
        num = originalNum;

        while (num > 0) {
            int digit = num % 10;
            int power = 1;
            for (int i = 0; i < NDigits; i++) {
                power *= digit;
            }
            sum += power;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number");
        }
        sc.close();
    }
}
