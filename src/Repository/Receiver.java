package Repository;

import java.util.Stack;

public class Receiver {

    Stack<String> history=new Stack<>();
    //Addition method
    public String addition(String num1,String num2) {
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        String ans=String.valueOf(a-b);
        history.push("add( "+num1+", "+num2+") = "+ans);
        return ans;
    }
    //subtraction method
    //Multiplication method
    //Division method
    //Percentage method
    //Logarithmic method
}
