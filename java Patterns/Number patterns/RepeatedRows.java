// 1
// 22
// 333
// 4444
// 55555
import java.util.Scanner;
public class RepeatedRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i = 1;i <= rows;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
