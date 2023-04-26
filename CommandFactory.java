public class CommandFactory {
    public Command createCommand(String commandName, String[] arguments){
        switch (commandName){
            case "open":
                if(arguments.length !=1) {
                    System.out.println("Usage:open [filename]");
                }else {
                    return new OpenCommand(arguments[0]);
                }
                break;
            case "close":
                if (arguments.length != 0){
                    System.out.println("Usage: close");
                } else{
                    return new CloseCommand();
                }
                break;
            case "save":
                if (arguments.length != 0){
                    System.out.println("Usage: save");
                } else {
                    return new SaveCommand("file.xml");
                }
                break;
            case "save as":
                if (arguments.length != 0){
                    System.out.println("Usage: save as [filename]");
                }else {
                    return new SaveAsCommand(arguments[0]);
                }
                break;
            case "help":
                if (arguments.length != 0){
                    System.out.println("usage: help");
                } else{
                    return new HelpCommand();
                }
                break;
            case"exit":
                if (arguments.length != 0){
                    System.out.println("usage: exit");
                }else{
                    return new ExitCommand();
                }
                break;
            default:
            }
            return null;
        }
    }
