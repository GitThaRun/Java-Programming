import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(" ---- Library Management System ----");

            System.out.println("1.Add Book");
            System.out.println("2.Add User");
            System.out.println("3.List Books");
            System.out.println("4.List Users");
            System.out.println("5.Issue Book");
            System.out.println("6.Return Book");
            System.out.println("7.Exit");

            System.out.println("Choose an Option : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book Id : ");
                    String BookId = sc.nextLine();

                    System.out.println("Enter Book Title : ");
                    String Title = sc.nextLine();

                    System.out.println("Enter Author Name : ");
                    String Author = sc.nextLine();

                    lib.addBook(new Book(BookId,Title,Author));
                    break;
                
                    case 2:
                    System.out.println("Enter User Id : ");
                    String UserId = sc.nextLine();
                   

                    System.out.println("Enter User Name : ");
                    String UserName = sc.nextLine();

                    System.out.println("Enter User Mail : ");
                    String UserMail = sc.nextLine();

                    lib.addUser(new User(UserId,UserName,UserMail));
                    break;

                    case 3 : 
                    System.out.println("List of Books : ");
                    lib.listBooks();
                    break;

                    case 4 : 
                    System.out.println("List Of Users : ");
                    lib.listUsers();
                    break;

                    case 5:
                    System.out.println("Enter Book Id To Issue : ");
                    String IssueBookId = sc.nextLine();

                    System.out.println("Enter User Id To Issue :");
                    String IssueUserId = sc.nextLine();

                    lib.issueBook(IssueBookId, IssueUserId);
                    break;

                    case 6:
                    System.out.println("Enter Book Id To Return : ");
                    String ReturnBookId = sc.nextLine();

                    System.out.println("Enter User Id To Return : ");
                    String ReturnUserId = sc.nextLine();

                    lib.returnBook(ReturnBookId, ReturnUserId);
                    break;

                    case 7:
                    System.out.println("Exiting the System....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        } 
    }
}
