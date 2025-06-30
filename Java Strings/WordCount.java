import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence : ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        int WordCount = words.length;

        System.out.println("Total Word count : "+WordCount);

        sc.close();
    }
}
