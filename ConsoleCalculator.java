import java.util.Scanner;

class ConsoleCalculator {

    void printOptions(){
        System.out.println("Options:");
        System.out.println("1. Add ");
        System.out.println("2. Subtract ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Divide ");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    int getIntInput(java.util.Scanner scanner, String message){
        System.out.println(message);
        int inp = scanner.nextInt();
        scanner.nextLine();
        return inp;
    }

    void doActionsForOption(int option, java.util.Scanner scanner, CalculatorInvoker invoker){
        System.out.printf("Option selected %s", option);
        System.out.println();
        switch (option) {
            case 1:
                invoker.setCommand(new AdditionCommand());
                int num1 = getIntInput(scanner, "Give first integer number");
                int num2 = getIntInput(scanner, "Give second integer number");
                System.out.println("Output: "+ invoker.calculate(num1, num2));
                return;
            case 2:
                invoker.setCommand(new SubstractionCommand());
                num1 = getIntInput(scanner, "Give first integer number");
                num2 = getIntInput(scanner, "Give second integer number");
                System.out.println("Output: "+ invoker.calculate(num1, num2));
                return;
            case 3:
                invoker.setCommand(new MultiplicationCommand());
                num1 = getIntInput(scanner, "Give first integer number");
                num2 = getIntInput(scanner, "Give second integer number");
                System.out.println("Output: "+ invoker.calculate(num1, num2));
                return;
            case 4:
                invoker.setCommand(new DivisionCommand());
                num1 = getIntInput(scanner, "Give first integer number");
                num2 = getIntInput(scanner, "Give second integer number");
                System.out.println("Output: "+ invoker.calculate(num1, num2));
                return;
            case 5:
                System.out.println("Exiting the application.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
                System.out.println();
        }

    }
    public void start() {
        CalculatorInvoker invoker = new CalculatorInvoker();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            printOptions();
            int choice = getIntInput(scanner, "");
            doActionsForOption(choice, scanner, invoker);
        }
    }

}

