package Services.Command;

import Repository.Receiver;

public class MultiplicationCommand implements Commands{

    Receiver receiver=new Receiver();

    public MultiplicationCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public String execute(String num1, String num2) {
        return null;
    }
}
