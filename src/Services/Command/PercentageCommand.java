package Services.Command;

import Repository.Receiver;

public class PercentageCommand implements Commands{

    Receiver receiver=new Receiver();

    public PercentageCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return null;
    }
}
