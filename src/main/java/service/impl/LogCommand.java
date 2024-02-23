package src.main.java.service.impl;

import src.main.java.service.Command;

public class LogCommand implements Command {
    public void execute(double num) {
        double result = Math.log(num);
        System.out.println("Result is : " + result);
    }
}
