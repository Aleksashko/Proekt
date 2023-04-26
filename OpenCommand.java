import java.io.File;
public class OpenCommand implements Command{
    private String filename;

    public OpenCommand(String filename) {
        this.filename = filename;
    }

    @Override
    public void execute(){
        File file = new File(filename);
        if (file.exists())
        {
            System.out.println("Sucessfully open" + filename);
        } else {
            System.out.println("File does not exist");
            }
    }
}
