package src.main.java.service.impl;

import src.main.java.service.Command;

public class ExponentialCommand implements Command {
    public void execute(double num) {
        double result = Math.exp(num);
        System.out.println("Result is : " + result);
    }
}
