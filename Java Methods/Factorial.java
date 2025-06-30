import java.util.Scanner;
public class Factorial {
   
    public static long factorial(int n){
        long cal = 1;

        for(int i = 1;i <= n;i++){
            cal *= i;
        }
        return cal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        long result = factorial(num);

        System.out.println("The Factorial of " +num+ "is : "+result);

        sc.close();
    }
}
