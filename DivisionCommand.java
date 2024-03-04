import java.util.Scanner;

public class DivisionCommand implements Command{
    @Override
    public void execute() {
        try {
            Scanner scanner = new Scanner(System.in);
            Division division = new Division();
            System.out.println("Enter two numbers ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = division.performDivision(num1, num2);
            System.out.println("Division" + result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
