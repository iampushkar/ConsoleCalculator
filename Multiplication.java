import java.util.Scanner;

public class Multiplication {
    public double performMultiplication(Scanner scanner) {
        System.out.println("Enter numbers to multiply (separated by space), type 'any' to finish:");
        double result = 1;
        while (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            result *= num;
        }
        return result;
    }

}

