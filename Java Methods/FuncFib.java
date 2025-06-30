import java.math.BigInteger;
import java.util.Scanner;
public class FuncFib {
    public static BigInteger fib(int n){

        if(n == 1){
            return BigInteger.ZERO;
        }
        if(n == 2){
            return BigInteger.ONE;
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger next = BigInteger.ZERO;

        for(int i = 3;i <= n;i++){
            next = a.add(b);
            a = b;
            b = next;
        }
        return next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        BigInteger result = fib(num);
        System.out.println("The Fibonacci of " + num + " is : "+result);

        sc.close();
    }
}
