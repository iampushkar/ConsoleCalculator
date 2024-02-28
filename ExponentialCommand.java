import java.util.Scanner;

public class ExponentialCommand implements Command{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Exponential exponential= new Exponential();
        System.out.println("Enter two numbers ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = exponential.performExponential(num1,num2);
        System.out.println("Exponential" + result);
    }
}
