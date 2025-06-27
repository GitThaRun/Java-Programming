import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:");
        String Og = sc.nextLine();

        String Reverse = "";

        for(int i = Og.length() - 1;i >= 0;i--){
            Reverse += Og.charAt(i);
        }
        if(Og.equals(Reverse)){
            System.out.println(Og + " is a Palindrome String");
        }
        else{
            System.out.println("Given String is not a Palindrome String");
        }
        sc.close();
    }
}
