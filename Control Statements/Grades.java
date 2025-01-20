import java.util.*;

public class Grades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3, sub4, sub5;
        int TotalSubjects = 5;
        float average;
        String grade;

        System.out.println("Enter marks of sub1:");
        sub1 = sc.nextInt();

        System.out.println("Enter marks of sub2:");
        sub2 = sc.nextInt();

        System.out.println("Enter marks of sub3:");
        sub3 = sc.nextInt();

        System.out.println("Enter marks of sub4:");
        sub4 = sc.nextInt();

        System.out.println("Enter marks of sub5:");
        sub5 = sc.nextInt();

        average = (sub1 + sub2 + sub3 + sub4 + sub5) / (float) TotalSubjects;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "FAIL";
        }

        System.out.println("Marks Obtained:" + average);
        System.out.println("Grade Obtained:" + grade);
        sc.close();
    }
}
