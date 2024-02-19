package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the choices..");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Factorial");
        System.out.println("7. Root");
        System.out.println("8. Exponential");
        System.out.println("9. Log");
        System.out.println("10. Percentage");
        System.out.println("11. Sine");
        System.out.println("12. Cosine");
        System.out.println("13. Show History");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Operations op = new Operations();
        int num1 = 0;
        int num2 = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter two number");
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                op.add(num1, num2);
                break;

            case 2:
                System.out.println("Enter two number");
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                op.sub(num1, num2);
                break;
            case 3:
                System.out.println("Enter two number");
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                op.multiply(num1, num2);
                break;
            case 4:
                System.out.println("Enter two number");
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                op.divide(num1, num2);
                break;
            case 6:
                System.out.println("Enter the number");
                num1 = sc.nextInt();

                op.factorial(num1);
                break;
            case 7:
                System.out.println("Enter the number");
                Double num = sc.nextDouble();

                op.root(num);
                break;
            case 8:
                System.out.println("Enter the base and power");
                Double base = sc.nextDouble();
                Double power = sc.nextDouble();

                op.exponential(base, power);
                break;
            case 9:
                System.out.println("Enter the argument and base");
                Double arg = sc.nextDouble();

                op.logarithm(arg);
                break;
            case 10:
                System.out.println("Enter the numbers");
                Double number = sc.nextDouble();
                Double total = sc.nextDouble();

                op.percentage(number, total);
                break;
            case 11:
                System.out.println("Enter the number");
                Double sinNum = sc.nextDouble();

                op.sine(sinNum);
                break;
            case 12:
                System.out.println("Enter the number");
                Double cosNum = sc.nextDouble();

                op.sine(cosNum);
                break;

            default:
                break;
        }
    }
}
