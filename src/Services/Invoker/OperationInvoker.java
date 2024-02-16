package Services.Invoker;

import Services.Command.Commands;

public class OperationInvoker {

    Commands commands;

    public void setCommands(Commands commands)
    {
        this.commands=commands;
    }
    public String calculate(String num1,String num2)
    {
        return commands.execute(num1,num2);
    }
}
