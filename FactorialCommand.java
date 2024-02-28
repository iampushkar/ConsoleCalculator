import java.util.Scanner;

public class FactorialCommand implements Command{

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Factorial factorial= new Factorial();
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        double result = factorial.performFactorial(num1);
        System.out.println("Factorial" + result);
    }
}
