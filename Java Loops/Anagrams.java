import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String:");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String:");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("Strings are not Anagrams - Length Difference");
        }
        else{
            boolean isAnagram = true;

            for(int i = 0;i < str1.length();i++){
                char c = str1.charAt(i);

                int count1 = 0;
                int count2 = 0;

                for(int j = 0;j < str1.length();j++){
                    if(str1.charAt(i) == c){
                        count1++;
                    }
                }

                for(int j = 0;j < str2.length();j++){
                    if(str2.charAt(i) ==  c){
                        count2++;
                    }
                }
                if(count1 != count2){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println("Given Strings are Anagrams");
            }
            else{
                System.out.println("Strings are not Anagrams");
            }
        }
        sc.close();
    }
}
