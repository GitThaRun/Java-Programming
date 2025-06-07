import java.io.FileWriter;
import java.io.IOException;
public class WritingFile{
    public static void main(String[] args) {
        try {
            try (FileWriter MyWriter = new FileWriter("content.txt")) {
                MyWriter.write("Files in java are might be tricky,but fun enough");
                System.out.println("Successfully written into file");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}