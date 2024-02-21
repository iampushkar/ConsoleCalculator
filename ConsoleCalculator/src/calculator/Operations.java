package calculator;

import java.util.Stack;

/**
 * add
 * sub
 * multiply
 * divide
 * modulus
 * factorial
 * root
 * exponential
 * log
 * percentage
 * sine
 * cosine
 * conversions
 */
public class Operations {

    Stack<String> history = new Stack<>();

    public void add(int num1, int num2) {
        int sum = Math.addExact(num1, num2);
        System.out.println("Sum = " + sum);

        String operations = String.format("%s + %s = %s", num1, num2, sum);
        history.push(operations);
    }

    public void sub(int num1, int num2) {
        int diff = Math.subtractExact(num1, num2);
        System.out.println("Diff = " + diff);

        String operations = String.format("%s - %s = %s", num1, num2, diff);
        history.push(operations);
    }

    public void multiply(int num1, int num2) {
        int prod = Math.multiplyExact(num1, num2);
        System.out.println("Product = " + prod);

        String operations = String.format("%s * %s = %s", num1, num2, prod);
        history.push(operations);
    }

    public void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Divide By zero is not allowed");
        }

        int result = num1 / num2;
        System.out.println("Result = " + result);

        String operations = String.format("%s / %s = %s", num1, num2, result);
        history.push(operations);

    }

    public void factorial(int num1) {
        int result = fact(num1);

        System.out.println("Factorial = " + result);

        String operations = String.format("Fatorial of %s = %s", num1, result);
        history.push(operations);
    }

    private int fact(int num1) {
        if (num1 == 0 || num1 == 1) {
            return 1;
        }
        return num1 * fact(num1 - 1);
    }

    public void root(double num) {
        Double result = Math.sqrt(num);

        System.out.println("Root = " + result);

        String operations = String.format("Root of %s = %s", num, result);
        history.push(operations);
    }

    public void exponential(double num1, double num2) {
        Double result = Math.pow(num1, num2);

        System.out.println("Exponential = " + result);

        String operations = String.format("Exponential of %s = %s", num1, result);
        history.push(operations);
    }

    public void logarithm(Double arg) {
        Double result = Math.log(arg);
        System.out.println("Result = " + result);

        String operations = String.format("logarithm of %s = %s", arg, result);
        history.push(operations);
    }

    public void percentage(Double number, Double total) {
        Double result = (number / total) * 100;

        System.out.println("Result = " + result);

        String operations = String.format("percentage of %s = %s", number, result);
        history.push(operations);

    }

    public void sine(Double sinNum) {
        Double result = Math.sin(sinNum);
        System.out.println("result = " + result);

        String operations = String.format("sin of %s = %s", sinNum, result);
        history.push(operations);
    }

    public void cosine(Double cosNum) {
        Double result = Math.cos(cosNum);
        System.out.println("result = " + result);

        String operations = String.format("cos of %s = %s", cosNum, result);
        history.push(operations);
    }

    public void showHistory() {

        while (!history.isEmpty()) {
            System.out.println(history.pop());
        }
    }
}
