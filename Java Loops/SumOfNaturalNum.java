import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Upto Natural Number:");

        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1;i <= num;i++){
            sum += i;
        }
        System.out.println("The sum of " + num + " natural numbers is : " + sum);
        sc.close();
    }
}
