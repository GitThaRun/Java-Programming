import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1;i < n;i++){
            for(int j = 0;j<n;j++){
                int values = (i + j - 1)% n + 1;
                System.out.print(values + " ");
            }
            System.out.println();
        }
    }
    
}
