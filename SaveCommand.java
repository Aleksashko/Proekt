import java.io.File;
public class SaveCommand implements Command{
    private final String filename;

    public SaveCommand(String filename) {
        this.filename = filename;
    }

    @Override
    public void execute() {
        File file = new File(filename);
        if (file.exists()) {
            // save the file
            System.out.println("Successfully saved " + filename);
        } else {
            System.out.println("File does not exist");
        }
    }
}
