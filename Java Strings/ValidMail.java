import java.util.Scanner;
public class ValidMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mail : ");
        String mail = sc.nextLine();

        String mailPattern = "^[a-zA-z0-9._]+@gmail\\.com$";

        if(mail.matches(mailPattern)){
            System.out.println(mail + " is a Valid Mail");
        }
        else{
            System.out.println(mail + " is not a valid Mail.Enter Valid G-Mail");
        }
        sc.close();
    }
}
