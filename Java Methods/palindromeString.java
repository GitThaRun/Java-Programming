import java.util.Scanner;
public class palindromeString {
    public static boolean CheckPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String word = sc.nextLine();

        if(CheckPalindrome(word)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome String");
        }
        sc.close();
    }
}
