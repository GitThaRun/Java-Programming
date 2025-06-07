import java.io.File;
public class DeleteFolder{
    public static void main(String[] args) {
        File MyObj = new File("D:\\Java Programming\\Java File Handling\\DeleteFolder");
        if(MyObj.delete()){
            System.out.println("Deleted the folder : " +MyObj.getName());
        }
        else{
            System.out.println("Failed to delete folder");
        }
    }
}