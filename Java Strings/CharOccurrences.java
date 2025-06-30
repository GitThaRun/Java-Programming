import java.util.Scanner;
public class CharOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String word = sc.nextLine();
        
        System.out.print("Enter the which character to count : ");
        char ch = sc.next().charAt(0);

        word = word.toLowerCase();
        ch = Character.toLowerCase(ch);
        int count = 0;
        
        for(int i = 0;i < word.length();i++){
            if(word.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("The Total Occurrences of " + ch + " is : "+count);
        
        sc.close();
    }
}
