package src.main.java.service.impl;

import src.main.java.service.Command;

public class FactorialCommand implements Command {
    double result = 1.0;
    @Override
    public void execute(double num) {
        if (!(num == 0 | num == 1)) {
            for (double i = num; i >= 1; i--) {
                result = result * i;
            }
        }
        System.out.println("Result is : "+ result);
    }
}
