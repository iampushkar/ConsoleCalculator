package src.main.java.controller;

import src.main.java.service.CalculatorInvoker;
import src.main.java.service.impl.*;

import java.util.Scanner;

public class CalculatorController {
    Scanner sc = new Scanner(System.in);
    CalculatorInvoker calculatorInvoker= new CalculatorInvoker();

    public void runApplication(){
        while(true) {
            menu();
            String userAction = getUserInput();
            performAction(userAction);
        }
    }

    private void performAction(String userAction) {
        double[] numbers;
        double number;
        String unit;
        switch (userAction) {
            case "1":
                numbers = getUserOperands();
                calculatorInvoker.setCommand(new AdditionCommand());
                calculatorInvoker.calculate(numbers[0], numbers[1]);
                break;
            case "2":
                numbers = getUserOperands();
                calculatorInvoker.setCommand(new SubtractCommand());
                calculatorInvoker.calculate(numbers[0], numbers[1]);
                break;
            case "3":
                numbers = getUserOperands();
                calculatorInvoker.setCommand(new MultiplicationCommand());
                calculatorInvoker.calculate(numbers[0], numbers[1]);
                break;
            case "4":
                numbers = getUserOperands();
                calculatorInvoker.setCommand(new DivideCommand());
                calculatorInvoker.calculate(numbers[0], numbers[1]);
                break;
            case "5":
                numbers = getUserOperands();
                calculatorInvoker.setCommand(new ModuloCommand());
                calculatorInvoker.calculate(numbers[0], numbers[1]);
                break;
            case "6":
                number = getUserOperand();
                calculatorInvoker.setCommand(new FactorialCommand());
                calculatorInvoker.calculate(number);
                break;
            case "7":
                number = getUserOperand();
                calculatorInvoker.setCommand(new RootCommand());
                calculatorInvoker.calculate(number);
                break;
            case "8":
                number = getUserOperand();
                calculatorInvoker.setCommand(new ExponentialCommand());
                calculatorInvoker.calculate(number);
                break;
            case "9":
                number = getUserOperand();
                calculatorInvoker.setCommand(new LogCommand());
                calculatorInvoker.calculate(number);
                break;
            case "10":
                number = getUserOperand();
                calculatorInvoker.setCommand(new SineCommand());
                calculatorInvoker.calculate(number);
                break;
            case "11":
                number = getUserOperand();
                calculatorInvoker.setCommand(new CosineCommand());
                calculatorInvoker.calculate(number);
                break;
            case "12":
                numbers = getUserOperands();
                calculatorInvoker.setCommand(new PercentageCommand());
                calculatorInvoker.calculate(numbers[0], numbers[1]);
                break;
            case "13":
                number= getUserOperand();
                unit = getUserOperandWithUnit();
                calculatorInvoker.setCommand(new ConversionCommand());
                calculatorInvoker.calculate(number, unit);
                break;
            case "14":
               // showHistory();
                break;
            case "15":
                System.exit(200);
                break;
            default:
                System.out.println("Enter the valid input!!");
                break;
        }
    }

    private double[] getUserOperands() {
        System.out.print("Enter numbers on which you want to perform action" + " : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        return new double[]{num1, num2};
    }

    private double getUserOperand() {
        System.out.print("Enter number on which you want to perform action : ");
        return sc.nextDouble();

    }
    private String getUserOperandWithUnit() {
        System.out.print("Enter unit : " );
       // String presentUnit = sc.nextLine();
       // String newUnit = sc.nextLine();
       // return new String[]{presentUnit, newUnit};
        return sc.nextLine();
    }

    private String getUserInput() {
        System.out.print("Select the action you want to perform : ");
        return sc.nextLine();
    }

    public void menu() {
        System.out.println("Welcome to the Calculator Console App!!");
        System.out.println("Pick the action items : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Factorial");
        System.out.println("7. Root");
        System.out.println("8. Exponential");
        System.out.println("9. Log");
        System.out.println("10. Sine");
        System.out.println("11. Cosine");
        System.out.println("12. Percentage");
        System.out.println("13. Conversion");
        System.out.println("14. Show History");
        System.out.println("15. Exit!!");
    }
}
