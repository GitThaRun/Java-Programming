import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date in (yyyy-mm-dd) format: ");
        String start = sc.nextLine();

        System.out.print("Enter End Date in (yyyy-mm-dd) format : ");
        String end = sc.nextLine();

        LocalDate Date1 = LocalDate.parse(start);
        LocalDate Date2 = LocalDate.parse(end);

        long DaysCount = ChronoUnit.DAYS.between(Date1, Date2);

        System.out.println("The Number of Days Between " + Date1 + " and " + Date2 + " are: " +DaysCount);

        sc.close();
    }
}
