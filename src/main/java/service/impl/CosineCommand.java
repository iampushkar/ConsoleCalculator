package src.main.java.service.impl;

import src.main.java.service.Command;

public class CosineCommand implements Command {
    public void execute(double num) {
        double result = Math.cos(num);
        System.out.println("Result is : " + result);
    }
}
