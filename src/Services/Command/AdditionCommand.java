package Services.Command;

import Repository.Receiver;

public class AdditionCommand implements Commands {

    Receiver receiver=new Receiver();

    public AdditionCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute(String num1,String num2) {
        return receiver.addition(num1,num2);
    }
}
