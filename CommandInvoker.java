import java.util.Scanner;
public class CommandInvoker {
    private final Scanner scanner;
    private final CommandFactory commandFactory;

    public CommandInvoker(Scanner scanner, CommandFactory commandFactory) {
        this.scanner = scanner;
        this.commandFactory = commandFactory;
    }
    public void run(){
        while(true){
            System.out.println("> ");
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            if (tokens.length == 0) {
                continue;
            }
            String commandName = tokens[0];
            String[] arguments = new String[tokens.length - 1];
            System.arraycopy(tokens, 1, arguments, 0, arguments.length);
            Command command = commandFactory.createCommand(commandName, arguments);
            if (command != null) {
                command.execute();
            } else {
                System.out.println("Unknown command: " + commandName);
            }
        }
    }
}
