// 1
// 12
// 123
// 1234
// 12345
import java.util.Scanner;
public class IncrementalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        
        for(int i = 1;i <= rows;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
