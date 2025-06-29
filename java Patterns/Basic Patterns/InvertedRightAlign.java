
// pattern
// *****
//  ****
//   ***
//    **
//     *

import java.util.Scanner;
public class InvertedRightAlign {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter Rows : ");
       int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
