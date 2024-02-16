package Services.Command;

import Repository.Receiver;

public class LogarithmicCommand implements Commands{

    Receiver receiver=new Receiver();

    public LogarithmicCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return null;
    }
}
