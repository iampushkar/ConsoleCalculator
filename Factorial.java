public class Factorial {
    public double performFactorial(int fact) {
        double result = 1;
        if (fact == 0)
            return 1;
        for (int i = 1; i <= fact; i++) {
            result *= i;
        }
        return result;
    }
}
