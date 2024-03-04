import java.util.Scanner;

public class SquareRootCommand implements Command{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        SquareRoot squareRoot = new SquareRoot();
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        double result = squareRoot.performRoot(num1);
        System.out.println("SquareRoot" + result);
    }
}
