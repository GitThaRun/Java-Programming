import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int originalNum = sc.nextInt();

        int temp = originalNum;
        int count = 0;

        while(temp != 0){
            temp /= 10;
            count++;
        }

        int sum = 0;
        temp = originalNum;

        while(temp != 0){
            int digit = temp % 10;
            sum += Math.pow(digit,count);
            temp /= 10;
        }

        if(sum == originalNum){
            System.out.println(originalNum + " is an Armstrong Number");
        }
        else{
            System.out.println(originalNum + " is not an Armstrong Number");
        }       
        sc.close();
    }
}
