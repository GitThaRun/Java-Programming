import java.util.Scanner;
public class Palindrome {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Number:");
    int Number = sc.nextInt();

    int Original = Number;
    int Reverse = 0;

    while(Number > 0){
        int digit = Number % 10;
        Reverse = Reverse * 10 + digit;
        Number = Number/10;
    }
    if(Original == Reverse){
        System.out.println(Original + " is a Palindrome Number!");
    }
    else{
        System.out.println("Not a Palindrome Number");

    }
    sc.close();
   }
}
