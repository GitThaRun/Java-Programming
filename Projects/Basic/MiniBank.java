import java.util.*;
public class MiniBank {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        double balance = 0;
        int choice;
        boolean isRunning = true;

        while(isRunning){

            System.out.println("***********************");
            System.out.println("Mini Banking System : ");
            System.out.println("***********************\n");


            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.WithDrawal");
            System.out.println("4.Exit\n");

            System.out.print("Select Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 : 
                 ShowBalance(balance);
                 break;

                case 2 :
                  balance += Deposit();
                  System.out.println("Amount Deposited Successfully\n"); 
                  break;

                case 3 : {
                    balance -= Withdrawal(balance);
                    System.out.println("Withdrawal Complete.Please Check Your Balance\n");
                    break;
                }
                case 4 : 
                isRunning = false;
                break;

                default :
                 System.out.println("Enter Valid Choice!!");
                 break;
            }
        }

        System.out.println("ThankYou! Have a Nice Day");
        sc.close();
    }

    public static void ShowBalance(double balance){
        System.out.printf("Current Balance : %.2f\n",balance);
    }

    public static double Deposit(){

        double amount;
        System.out.print("Enter An Amount To Be Deposited : ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("Amount Should be Greater Than Zero");
            return 0;
        }

        else{
           return amount;
        }
    }

    public static double Withdrawal(double balance){

        double amount;

        System.out.print("Enter Amount To Withdraw : ");
        amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient balance!");
            return 0;
        }

        else if(amount < 0){
            System.out.println("Amount Can't Be Negative!");
            return 0;
        }

        else{
            
            return amount;
        }

    }
}
