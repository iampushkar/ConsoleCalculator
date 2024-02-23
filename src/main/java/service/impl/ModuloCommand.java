package src.main.java.service.impl;

import src.main.java.service.Command;

public class ModuloCommand implements Command {
    @Override
    public void execute(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot modulus by zero");
        }
        double result = num1%num2;
        System.out.println("Result is : " + result);
    }
}
