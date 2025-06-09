import java.util.*;
public class Simplecalculator{
    public static String calculatorMenu(){
        return "Welcome to simple calculator\n" +
                "Choose one operation:\n" +
                "1.Addition\n" +
                "2.Substraction\n"+
                "3.Multiplication\n" +
                "4.Division\n" +
                "5.Exit\n";
    }
    public static void userInput(Scanner sc,int numbers[]){
        System.out.println("Enter Two Numbers:");
        System.out.println("Enter First Number:");
        numbers[0] = sc.nextInt();
        System.out.println("Enter Second Number:");
        numbers[1] = sc.nextInt();
    }

    public static int additon(int a,int b){
        return a + b;
    }
    public static int Substraction(int a,int b){
        return a-b;
    }
    public static int Multiplication(int a,int b){
        return a*b;
    }
    public static int Division(int a,int b){
        if(b!=0){
            return a/b;
        }else{
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        }

        public static String calFunctions(int choice,Scanner sc){
            int[] numbers = new int[2];
            String result = "";

           if(choice == 1){
            userInput(sc, numbers);
            result = "The Sum is : " + additon(numbers[0],numbers[1]);
           }
           else if(choice == 2){
            userInput(sc, numbers);
            result = "The Difference is : " + Substraction(numbers[0], numbers[1]);
           }
           else if (choice == 3){
            userInput(sc, numbers);
            result = "The Product is : " + Multiplication(numbers[0], numbers[1]);
           }
           else if(choice == 4){
            userInput(sc, numbers);
            result = "The Division is : " + Division(numbers[0], numbers[1]);
           }
           else{
            result = "Exiting the calculator";
           }
           return result;

        }
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

           while(true){

            System.out.println(calculatorMenu());
            System.out.print("Select Operation : ");
            int choice = sc.nextInt();
           
            String result = calFunctions(choice, sc);
            System.out.println(result);

            if(choice == 5){
                break;
            }
           }
           sc.close();
        }
    }
