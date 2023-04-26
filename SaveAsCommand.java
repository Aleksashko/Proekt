import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class SaveAsCommand implements Command{
    private final String filename;

    public SaveAsCommand(String filename) {
        this.filename = filename;
    }

    @Override
    public void execute() {
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            // write the file
            writer.close();
            System.out.println("Successfully saved " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
