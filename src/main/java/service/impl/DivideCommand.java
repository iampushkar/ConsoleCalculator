package src.main.java.service.impl;

import src.main.java.service.Command;

public class DivideCommand implements Command {
    @Override
    public void execute(double num1, double num2) {
        if(!(num2==0)){
            double result = num1 / num2;
            System.out.println("Result is : " + result);
        } else{
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
