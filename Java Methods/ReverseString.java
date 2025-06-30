import java.util.Scanner;
public class ReverseString {
    public static String Rev(String word){
        String reversed = " ";

        for(int i = word.length() - 1;i >= 0;i--){
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String word = sc.nextLine();

        String result = Rev(word);

        System.out.println("Reversed String : "+result);

        sc.close();
    }
}
