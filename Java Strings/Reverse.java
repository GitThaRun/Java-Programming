import java.util.Scanner; 
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String word = sc.nextLine();
        
        String rev = " "; 

        for(int i = word.length() - 1;i >= 0;i--){
            rev += word.charAt(i);
        }
        
        System.out.println("Original String is : "+word);
        System.out.println("Reversed String is : "+rev);

        sc.close();
    }
}
