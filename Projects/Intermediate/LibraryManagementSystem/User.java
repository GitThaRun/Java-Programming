import java.util.ArrayList;
import java.util.List;
public class User {
    private String UserId;
    private String UserName;
    private String UserMail;
    private List<Book> BooksIssued;

    public User(String UserId,String UserName,String UserMail){
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserMail = UserMail;
        this.BooksIssued = new ArrayList<>();
    }

    public String getUserId(){
        return UserId;
    }

    public String getUserName(){
        return UserName;
    }

    public String getUserMail(){
        return UserMail;
    }

    public List<Book> getBooksIssued(){
        return BooksIssued;
    }

    public void issueBook(Book book){
        BooksIssued.add(book);
    }
    public void returnBook(Book book){
       BooksIssued.remove(book);
    }

    public void getIssuedBooks(){
        if(BooksIssued.isEmpty()){
            System.out.println(UserName + "has no books issued");
        }
        else{
            System.out.println(UserName + "has issued ");
            for(Book book : BooksIssued){
                System.out.println(" - " + book.getTitle());
            }
        }
    }

    @Override
    public String toString(){
        return "[" + UserId + "] " + UserName + " (" + UserMail + ") - Books Issued : " + BooksIssued.size();
    }

}
