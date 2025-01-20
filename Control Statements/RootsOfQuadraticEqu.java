import java.util.Scanner;

public class RootsOfQuadraticEqu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient of A:");
        double a = sc.nextDouble();
        System.out.println("Enter coefficient of B:");
        double b = sc.nextDouble();
        System.out.println("Enter coefficient of C:");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant) / 2 * a);
            double root2 = (-b - Math.sqrt(discriminant) / 2 * a);
            System.out.printf("Roots are real and distinct: \nRoot1: %.2f\nRoot2: %.2f\n", root1, root2);
        }

        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Two real and Equal roots: \nRoot: %.2f\n", root);
        } else {
            double realpart = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are complex and imaginary: \nRoot1 : %.2f + %.2fi\nRoot2 : %.2f - %.2fi\n",
                    realpart, imaginary, realpart,
                    imaginary);
        }
        sc.close();
    }
}
