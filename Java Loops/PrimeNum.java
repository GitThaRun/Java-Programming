import java.util.Scanner;

class PrimeNum
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true; // Assum n is prime.

        while (i < n) {
           
            if(n % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
	}
}
