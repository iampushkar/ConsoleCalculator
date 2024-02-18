class CalculatorInvoker {
    Command command1;

    void setCommand(Command command) {
        this.command1 = command;
    }

    int calculate(int num1, int num2) {
        return command1.execute(num1, num2);
    }
}
