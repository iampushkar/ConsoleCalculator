package Controller;

import Repository.Receiver;
import Services.Command.AdditionCommand;
import Services.Invoker.OperationInvoker;

import java.util.Scanner;

public class CalculatorApp {

    private Scanner scanner = new Scanner(System.in);
    private OperationInvoker operationInvoker=new OperationInvoker();
    public void runCalculatorApp() {
        //Running Calculator Application
        ShowMenuToUser();
        PerformOperation();
    }

    private void PerformOperation() {
        //Perform the chosen operation
        //1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Percentage 6. Logarithmic
        Boolean flag=true;
        while (flag)
        {
            System.out.println("Enter your choice: ");
            String input=scanner.nextLine().trim();
            switch (input){
                case "1":
                    System.out.println("Enter first number: ");
                    String num1=scanner.nextLine().trim();
                    System.out.println("Enter second number: ");
                    String num2=scanner.nextLine().trim();
                    operationInvoker.setCommands(new AdditionCommand(new Receiver()));
                    System.out.println("Addition Result is: "+operationInvoker.calculate(num1,num2));
                    break;
                case "8":
                    System.out.println("Exit Application...");
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            if(flag==false){
                break;
            }
            ShowMenuToUser();
        }
    }

    private void ShowMenuToUser() {
        //This will show all the operations to the user
        System.out.println("These are the options of operations. Choose one option: ");
        System.out.println("1. Addition");
        System.out.println("2. subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Percentage");
        System.out.println("6. Logarithmic");
        System.out.println("7. Show History");
        System.out.println("8. Exit Application");
    }
}
