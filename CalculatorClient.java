import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorInvoker invoker = new CalculatorInvoker();
        while (true) {
            menu();
            String input = scanner.next();
            performOperation(input, invoker);

        }
    }


    private static void menu() {
        System.out.println("Welcome to the calculator app");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("5.Modulus");
        System.out.println("6.Percentage");
        System.out.println("7.Factorial");
        System.out.println("8.Exponential");
        System.out.println("9.Square root");
        System.out.println("16.Exit");
    }

    private static void performOperation(String input, CalculatorInvoker invoker) {
        switch (input) {
            case "1":
                invoker.setCommand(new AdditionCommand());
                break;
            case "2":
                invoker.setCommand(new SubtractionCommand());
                break;
            case "3":
                invoker.setCommand(new DivisionCommand());
                break;
            case "4":
                invoker.setCommand(new MultiplicationCommand());
                break;
            case "5":
                invoker.setCommand(new ModulusCommand());
                break;
            case "6":
                invoker.setCommand(new PercentageCommand());
                break;
            case "7":
                invoker.setCommand(new FactorialCommand());
                break;
            case "8":
                invoker.setCommand(new ExponentialCommand());
                break;
            case "9":
                invoker.setCommand(new SquareRootCommand());
                break;
            case "16":
                System.exit(200);
        }
        invoker.executeCommand();
    }

}
