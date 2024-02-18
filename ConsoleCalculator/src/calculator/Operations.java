package calculator;

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

    public void add(int num1, int num2) {
        int sum = Math.addExact(num1, num2);
        System.out.println("Sum = " + sum);
    }

    public void sub(int num1, int num2) {
        int diff = Math.subtractExact(num1, num2);
        System.out.println("Diff = " + diff);
    }

    public void multiply(int num1, int num2) {
        int prod = Math.multiplyExact(num1, num2);
        System.out.println("Product = " + prod);
    }

    public void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Divide By zero is not allowed");
        }

        int result = num1 / num2;
        System.out.println("Result = " + result);
    }

    public void factorial(int num1) {
        int result = fact(num1);

        System.out.println("Factorial = " + result);
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
    }

    public void exponential(double num1, double num2) {
        Double result = Math.pow(num1, num2);

        System.out.println("Exponential = " + result);
    }

    public void logarithm(Double arg) {
        Double result = Math.log(arg);
        System.out.println("Result = " + result);
    }

    public void percentage(Double percent) {
        
    }
}
