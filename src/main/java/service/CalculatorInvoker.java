package src.main.java.service;

public class CalculatorInvoker {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void calculate(double num1, double num2){
        command.execute(num1, num2);
    }
    public void calculate(double num){
        command.execute(num);
    }
    public void calculate(double num, String fromUnit){
        command.execute(num, fromUnit);
    }
}
