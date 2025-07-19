public class Book {
    private String BookId;
    private String Title;
    private String Author;
    private boolean IsIssued;

    public Book(String BookId,String Title,String Author){
        this.BookId = BookId;
        this.Title = Title;
        this.Author = Author;
        this.IsIssued = false;
    }

    public String getBookId(){
        return BookId;
    }

    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return Author;
    }

    public Boolean isIssued(){
        return IsIssued;
    }

    public void issueBook(){
        IsIssued = true;
    }

    public void returnBook(){
        IsIssued = false;
    }

    public String toString(){
        return "[" + BookId + "] " + Title + " By " + Author + " - " + (IsIssued? " (Issued) " : " (Available)");
    }

}
