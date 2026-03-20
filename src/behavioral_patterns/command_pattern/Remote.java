package behavioral_patterns.command_pattern;

public class Remote {
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}
