import java.util.Scanner;

public class Anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 :");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.println("Enter string2:");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The string are not Anagrams");
        } else {
            int[] charcount = new int[26];
            for (char c : str1.toCharArray()) {
                charcount[c - 'a']++;
            }
            for (char c : str2.toCharArray()) {
                charcount[c - 'a']--;
            }

            boolean isArmstrong = true;
            for (int count : charcount) {
                if (count != 0) {
                    isArmstrong = false;
                    break;
                }
            }
            if (isArmstrong) {
                System.out.println("The Strings are Anagram");
            } else {
                System.out.println("The Strings are not Anagram");
            }
        }
        sc.close();
    }
}
