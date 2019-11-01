package uestc.glb.design.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommands(){
        for(Command command : commands){
            command.execute();
        }
        commands.clear();
    }
}
