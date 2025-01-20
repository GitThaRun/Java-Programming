import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num1,num2,result;
        char operator;
        
        System.out.println("Enter number1:");
        num1 = sc.nextInt();

        System.out.println("Enter number2:");
        num2 = sc.nextInt();

        System.out.println("Enter an operator (+,-,*,/): ");
        operator = sc.next().charAt(0);
        
        switch(operator){
            case '+':
            result = num1 + num2;
            System.out.println("Result is :"+result);
            break;
        
           case '-':
           result = num1 - num2;
           System.out.println("Result is :"+result);
           break;

           case '*':
           result = num1*num2;
           System.out.println("Result is :"+result);
           break;

           case '/':
           if(num2!=0){
            result = num1/num2;
            System.out.println("Result is :"+result);
           }
           else{
            System.out.println("Error!Division not allowed");
           }
           break;

           default:
           System.out.println("Error!Invalid operator");
           break;
        }
        sc.close();
    }
}
