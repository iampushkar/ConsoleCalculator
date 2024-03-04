public class Modulus {
    public double performModulus(double modNum1, double modNum2) {
        if (modNum2 == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return modNum1 % modNum2;
    }
}
