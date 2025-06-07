import java.io.File;
public class DeleteFile{
    public static void main(String[] args) {
            File MyObj = new File("DeleteFile.txt");
            if(MyObj.delete()){
                System.out.println("Successfully deleted file: "+MyObj.getName());
            }
            else{
                System.out.println("Failed to delete file");
            }
        } 
    }