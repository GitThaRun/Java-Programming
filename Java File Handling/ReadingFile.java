import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFile{
    public static void main(String[] args) {
        try {
            File MyObj = new File("content.txt");
            Scanner MyReader = new Scanner(MyObj);
            while(MyReader.hasNextLine()){
                String data = MyReader.nextLine();
                System.out.println(data);
            }
            MyReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
    }
}
