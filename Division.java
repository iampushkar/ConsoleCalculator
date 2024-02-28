import java.text.DecimalFormat;

public class Division {
     public double performDivision(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.parseDouble(df.format(num1 / num2));
    }
}
