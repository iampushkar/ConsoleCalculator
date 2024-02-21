package src.main.java.service.impl;

import src.main.java.service.Command;

public class MultiplicationCommand implements Command {
    double result = 0.0;
    @Override
    public void execute(double num1, double num2) {
        result = num1 * num2;
        System.out.println("Result is : " + result);
    }
}
