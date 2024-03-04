import java.util.Scanner;

public class MultiplicationCommand implements Command {
    @Override
    public void execute() {
        Multiplication multiplication = new Multiplication();
        Scanner scanner = new Scanner(System.in);
        double result = multiplication.performMultiplication(scanner);
        System.out.println("Multiplication" + result);
    }
}
