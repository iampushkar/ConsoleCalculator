public class CalculatorInvoker {
    Command command;
   public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}
