public class HelpCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Possible commands:");
        System.out.println("open [filename]");
        System.out.println("close");
        System.out.println("save");
        System.out.println("saveas [filename]");
        System.out.println("help");
        System.out.println("exit");
    }
}
