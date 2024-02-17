package Services.Command;

import Repository.Receiver;

public class LogarithmicCommand implements Commands{

    Receiver receiver=new Receiver();

    public LogarithmicCommand(Receiver receiver) {
        this.receiver = receiver;
    }



    @Override
    public String execute(String num1, String num2) {
        return receiver.logarithmic(num1,num2);
    }
}
