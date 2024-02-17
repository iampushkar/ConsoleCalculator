package Services.Command;

import Repository.Receiver;

public class PercentageCommand implements Commands{

    Receiver receiver=new Receiver();

    public PercentageCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public String execute(String num1, String num2) {
        return receiver.percentage(num1,num2);
    }
}
