import java.util.Scanner;

public class Subtraction  {
    public double performSubtraction(Scanner scanner) {
        System.out.println("Enter numbers to subtract (separated by space), type 'any' to finish:");
        double result = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                result -= num;
            } else {
                String token = scanner.next();
                if (token.equals("any")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'any' to finish.");
                }
            }
        }
        return result;
    }
}
