package calculator.commands.impl;

import calculator.CalculatorHistory;
import calculator.commands.Command;

public class AdditionCommand implements Command {
    private final CalculatorHistory history;

    public AdditionCommand(CalculatorHistory history) {
        this.history = history;
    }

    @Override
    public void execute(double num1, double num2) {
        double result = num1 + num2;
        history.addOperation(num1 + " + " + num2 + " = " + result);
        System.out.println(result);
    }
}