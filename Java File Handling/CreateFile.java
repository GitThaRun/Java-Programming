import java.io.File;
import java.io.IOException;
public class CreateFile{
    public static void main(String[] args) {
       try {
        File MyObj = new File("DeleteFolder.java");
        if(MyObj.createNewFile()){
            System.out.println("File Created:" +MyObj.getName());
        }
        else{
            System.out.println("File Already exists");
        }
       } catch (IOException e) {
        System.out.println("An Error Occurred");
        
       }
    }
}