// 1 2 3 4 5 
// 2 3 4 5 1 
// 3 4 5 1 2 
// 4 5 1 2 3 
// 5 1 2 3 4 
import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i = 1;i <= rows;i++){
            for(int j = i;j <= rows;j++){
                System.out.print(j + " ");
            }
            for(int j = 1;j < i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
