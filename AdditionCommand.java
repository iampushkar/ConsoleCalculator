import java.util.Scanner;

public class AdditionCommand implements Command{

    @Override
    public void execute() {
        Addition addition = new Addition();
        Scanner scanner = new Scanner(System.in);
        double result = addition.performAddition(scanner);
        System.out.println("Sum" + result);
    }
}
