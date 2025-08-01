//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i = 1;i <= rows;i++){
            for(int j = 1;j <= rows - i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= (2 * i - 1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = rows - 1;i >= 1;i--){
            for(int j = 1;j <= rows - i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= (2 * i - 1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
