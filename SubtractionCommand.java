import java.util.Scanner;

public class SubtractionCommand implements Command{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Subtraction subtraction = new Subtraction();
        double result = subtraction.performSubtraction(scanner);
        System.out.println("subtraction" + result);
    }
}
