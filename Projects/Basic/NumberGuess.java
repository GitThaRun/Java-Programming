import java.util.*;
public class NumberGuess{
    public static int getRandomNum()
    {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
    public static String giveHint(int userguess,int number){
       if(userguess < (number - 10) || userguess > (number + 10)){
        return "Cold!";
       }
       else if(number == userguess){
        return "Right";
       }
       else{
        return "Hot!";
       }
    }
    public static void runGuess(){
        int Num = getRandomNum();
        int guess;
        String Hint;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number between 1 and 100:");
            guess = sc.nextInt();
                
                if(guess < 1 || guess > 100){
                    System.out.println("Please Enter Number between 1 and 100");
                    continue;
                }

                Hint = giveHint(guess, Num);
                if(Hint.equals("Right")){
                    System.out.println("You guessed it right!");
                    break;
                }
                else{
                    System.out.println(Hint);
                }
            }
            sc.close();
        }


    public static void main(String[] args){
        runGuess();
    }
}