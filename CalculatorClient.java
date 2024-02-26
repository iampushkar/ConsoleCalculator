import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorInvoker invoker = new CalculatorInvoker();
        while (true) {
            menu();
            String input = scanner.next();
            performOperation(scanner,input, invoker);

        }
    }


    private static void menu() {
        System.out.println("Welcome to the calculator app");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("16.Exit");
    }

    private static void performOperation(Scanner scanner, String input, CalculatorInvoker invoker) {
        switch (input) {
            case "1":
                System.out.println("Enter two numbers");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                invoker.setCommand(new Addition());
                invoker.executeCommand(num1, num2);
                break;
            case "2":
                System.out.println("Enter two numbers");
                double num3 = scanner.nextDouble();
                double num4 = scanner.nextDouble();
                invoker.setCommand(new Subtraction());
                invoker.executeCommand(num3,num4);
            case "16":
                System.exit(200);
        }
    }

}
