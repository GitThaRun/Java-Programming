import java.util.*;
public class GcdLCd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        //  without using Euclid's algorithm
        // Gcd Calculation
        int gcd = 1;
        for(int i = 1;i <= Math.min(a,b);i++){
            if(a % i ==  0 && b % i == 0){
                gcd = i;
            }
        }

        //Lcm calculation
        int lcm = Math.max(a,b);
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                break;
            }
            lcm++;
        }
        System.out.println("GCD of " + a  + " and " + b + " is : " +gcd);
        System.out.println("LCM of " + a  + " and " + b + " is : " +lcm);

        sc.close();
    }
}
