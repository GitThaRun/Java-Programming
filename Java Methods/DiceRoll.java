import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numofDice;

        System.out.print("Enter Number of Dice To Roll : ");
        numofDice = sc.nextInt();

        if(numofDice > 0){
           
            for(int i = 0;i < numofDice;i++){
                int roll = rand.nextInt(1,7);
                PrintDie(roll);
                System.out.println("You Rolled : " +roll);
            }
        }
        else{
            System.out.println("Number of Dice Must be Greater Than Zero");
        }
        sc.close();
    }

    static void PrintDie(int roll){

        String Dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String Dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String Dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String Dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String Dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String Dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1:
                System.out.println(Dice1);
                break;
            case 2:
                System.out.println(Dice2);
                break;
            case 3:
                System.out.println(Dice3);
                break;
            case 4:
                System.out.println(Dice4);
                break;
            case 5:
                System.out.println(Dice5);
                break;
            case 6:
                System.out.println(Dice6);
                break;
            default:
                System.out.println("Invalid Roll");
                break;
        }
     }
}