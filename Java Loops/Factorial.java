import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int fact = 1;
        
        for(int i = 1;i <= num;i++){
            fact *= i;
        }
        if(num < 0){
            System.out.println(("Enter Valid Number"));
        }
        else{
            System.out.println("Factorial of " + num + " is : " +fact);
        }

        sc.close();
    }
}
