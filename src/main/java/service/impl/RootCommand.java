package src.main.java.service.impl;

import src.main.java.service.Command;

public class RootCommand implements Command {
    public void execute(double num) {
        double result = Math.sqrt(num);
        System.out.println("Result is : " + result);
    }

}
