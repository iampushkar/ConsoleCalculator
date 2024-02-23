package src.main.java.service;

public interface Command {
    default void execute(double num1, double num2){
        System.out.println("Execute operations like add, sub, mul, div etc.");
    }

    default void execute(double num) {
        System.out.println("Execute operations like factorial, exp, log etc.");
    }
    default void execute(double num, String fromUnit){
        System.out.println("Execute conversion operation");
    }
}
