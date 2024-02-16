package Services.Invoker;

import Services.Command.Commands;

public class OperationInvoker {

    Commands commands;

    public OperationInvoker(Commands commands) {
        this.commands = commands;
    }
    String calculate()
    {
        return commands.execute();
    }
}
