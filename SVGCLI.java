import java.util.Scanner;
public class SVGCLI {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        CommandFactory commandFactory = new CommandFactory();
        CommandInvoker commandInvoker = new CommandInvoker(scanner, commandFactory);
        commandInvoker.run();
    }
}
