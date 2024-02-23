package src.main.java.service.impl;

import src.main.java.service.Command;

public class SineCommand implements Command {
    public void execute(double num) {
        double result = Math.sin(num);
        System.out.println("Result is : " + result);
    }
}
