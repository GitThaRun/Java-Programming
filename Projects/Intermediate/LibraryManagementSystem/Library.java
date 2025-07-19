import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book Added : " + book);
        
    }

    public void listBooks(){
        if(books.isEmpty()){
            System.out.println("No Books Available");
        }
        else{
            for(Book book : books){
                System.out.println(book);
            }
        }
    }

    public Book FindBookById(String BookId){
        for(Book book : books){
            if(book.getBookId().equals(BookId)){
                return book;
            }
        }
        return null;
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("User Added : " +user);
    }

    public void listUsers(){
        if(users.isEmpty()){
            System.out.println("No Users Registered");
        }
        else{
            for(User user : users){
                System.out.println(user);
            }
        }
    }

    public User findUserById(String UserId){
        for(User user : users){
            if(user.getUserId().equals(UserId)){
                return user;
            }  
        }
        return null;
    }

    public void issueBook(String BookId,String UserId){
        Book book = FindBookById(BookId);
        User user = findUserById(UserId);

        if(book == null || user == null){
            System.out.println("Book or User Not Found");
            return;
        }
       
        if(book.isIssued()){
            System.out.println("Book Already Issued");
            return;
        }
        book.issueBook();
        user.issueBook(book);

        System.out.println("Book Issued Successfully to : " +user.getUserName());
    }

    public void returnBook(String BookId, String UserId){
        Book book = FindBookById(BookId);
        User user = findUserById(UserId);

        if(book == null || user == null){
            System.out.println("Book Or User Not Found");
        }
        else if(!book.isIssued()){
            System.out.println("Book Not Issued");
        }
        else{
            book.returnBook();
            user.returnBook(book);
            System.out.println("Book Returned Successfully by : " + user.getUserName());
        }
    }
}
