//         1
//       1   1
//     1   2   1
//   1   3   3   1
// 1   4   6   4   1

import java.util.Scanner;
public class PascalPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i = 0;i < rows;i++){
            int number = 1;

            for(int j = 0;j < rows - i - 1;j++){
                System.out.print("  ");
            }

            for(int j = 0;j <= i;j++){
                System.out.print(number +  "    ");
                number = number * (i - j)/(j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}