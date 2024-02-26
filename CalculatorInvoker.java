public class CalculatorInvoker {
    Command command;
   public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand(double num1, double num2) {
        command.execute(num1, num2);
    }
}
