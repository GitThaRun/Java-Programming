import java.util.Scanner;

public class Armstong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        int FirstDigit = num / 100;
        int SecondDigit = (num / 10) % 10;
        int ThirdDigit = num % 10;

        int Armstong = (FirstDigit * FirstDigit * FirstDigit) + (SecondDigit * SecondDigit * SecondDigit)
                + (ThirdDigit * ThirdDigit * ThirdDigit);
        if (Armstong == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
        sc.close();
    }
}
