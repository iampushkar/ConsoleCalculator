public class Addition implements Command{
    @Override
    public void execute(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}
