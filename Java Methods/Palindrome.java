import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int num){

        int original = num;
        int reversed = 0;

        while(num > 0){
            int last = num % 10;
            reversed = reversed * 10 + last;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("The Given Number is a Palindrome");
        }
        
        else{
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}
