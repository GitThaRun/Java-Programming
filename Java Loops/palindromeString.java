import java.util.Scanner;

class palindromeString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // convert to lowercse
        String OriginalString = str.toLowerCase();

        String rev = "";
        int length = OriginalString.length();

        // Reverse the string
        for (int i = length - 1; i >= 0; i--) {
            rev += OriginalString.charAt(i);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < length; i++) {
            if (OriginalString.charAt(i) != rev.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(OriginalString + " is a palindrome String");
        } else {
            System.out.println(OriginalString + " is not a palindrome String");
        }

        sc.close();
    }
}
