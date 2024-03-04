public class Percentage {
    public double performPercentage(double perNum1, double perNum2) {
        if (perNum2 == 0) {
            throw new ArithmeticException("Percentage by zero is not allowed.");
        }
        return (perNum1 / perNum2) * 100;
    }
}
