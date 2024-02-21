package src.main.java.service.impl;

import src.main.java.service.Command;

public class AdditionCommand implements Command {
    double sum = 0.0;
    @Override
    public void execute(double num1, double num2) {
        sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }
}
