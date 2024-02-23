package src.main.java.service.impl;

import src.main.java.service.Command;

public class PercentageCommand implements Command {
    public void execute(double num1, double num2) {
        double result =  num1 * num2 /100.00;
        System.out.println("Result is : " + result);
    }
}
