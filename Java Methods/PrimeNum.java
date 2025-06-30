import java.util.Scanner;
public class PrimeNum {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a limit : ");
        int limit = sc.nextInt();
        
        if(limit == 1 || limit == 0){
            System.out.println("No Primes");
        }
        else{
            System.out.println("Prime Numbers up to " + limit + " are : ");
        }
    
        for(int i = 2;i <= limit;i++){
          if(isPrime(i)){
            System.out.print(i + " ");
          }
        }
        sc.close();
    }
}
