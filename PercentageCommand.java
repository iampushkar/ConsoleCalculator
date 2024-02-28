import java.util.Scanner;

public class PercentageCommand implements Command{
    @Override
    public void execute() {
        try {
            Scanner scanner = new Scanner(System.in);
            Percentage percentage = new Percentage();
            System.out.println("Enter two numbers ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = percentage.performPercentage(num1,num2);
            System.out.println("Percentage" + result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
