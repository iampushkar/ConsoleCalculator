package Services.Command;

import Repository.Receiver;

public class DivisionCommand implements Commands{

    Receiver receiver=new Receiver();
    public DivisionCommand(Receiver receiver) {
        this.receiver=receiver;
    }

    @Override
    public String execute() {
        return null;
    }
}
