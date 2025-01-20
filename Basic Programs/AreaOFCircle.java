import java.util.*;

class AreaOFCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        double area;
        System.out.println("Enter radius:");
        float radius = sc.nextFloat();
        area = PI * radius * radius;
        System.out.println("Area of Circle is :" + area);
        sc.close();
    }
}
