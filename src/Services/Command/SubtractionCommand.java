package Services.Command;

import Repository.Receiver;

public class SubtractionCommand implements Commands{

    Receiver receiver=new Receiver();

    public SubtractionCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public String execute(String num1, String num2) {
        return receiver.subtraction(num1,num2);
    }
}
