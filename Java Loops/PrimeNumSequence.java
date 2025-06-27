import java.util.*;
public class PrimeNumSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Upto Sequence:");
        int n = sc.nextInt();

        System.out.println("Prime Numbers Up To " + n + "Are:");

        for(int num = 2;num <= n;num++){
            boolean isPrime = true;

            for(int i = 2;i <= Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
