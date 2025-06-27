// we have to print this
// *****
// *   *
// *   *
// *****

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Rows:");
        int rows = sc.nextInt();
        
        System.out.print("Enter No Of Columns:");
        int cols = sc.nextInt();

        for(int i = 1;i <= rows;i++){
            for(int j = 1;j <= cols;j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
