import java.util.*;

public class TempConversion {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Farenheit Value:");
        int f = sc.nextInt();
        System.out.println("Enter celsius value:");
        int c = sc.nextInt();

        float FInCelsius = (f - 32) * 5 / 9;
        float CInFarenheit = (c * 5 / 9) + 32;

        System.out.println("Farenheit to celsius:" + FInCelsius);
        System.out.println("Celsius to Farenheit:" + CInFarenheit);
        sc.close();
    }
}
