import java.util.Scanner;

public class ModulusCommand implements Command{
    @Override
    public void execute() {
        try {
            Scanner scanner = new Scanner(System.in);
            Modulus modulus = new Modulus();
            System.out.println("Enter two numbers ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = modulus.performModulus(num1,num2);
            System.out.println("Modulus" + result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
