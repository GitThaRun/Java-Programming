import java.util.Scanner;
public class EuclidGcdLcm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        // GCD and LCM using Euclid's Algorithm

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD OF " + num1 + " and " + num2 + " is : " +gcd);
        System.out.println("LCM OF " + num1 + " and " + num2 + " is : " +lcm);

        sc.close();
    }
    }
