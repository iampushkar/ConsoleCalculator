class DivisionCommand implements Command{

    @Override
    public int execute(int num1, int num2) {
        if (num2 == 0){
            System.out.println("Division by 0. Please give correct input");
            return -1;
        }
        return num1 / num2;
    }
}
