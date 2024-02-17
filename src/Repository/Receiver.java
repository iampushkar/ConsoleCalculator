package Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Receiver {

    Stack<String> history=new Stack<>();
    //Addition method
    public String addition(String num1,String num2) {
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        String ans=String.valueOf(a+b);
        history.push("add( "+num1+", "+num2+") = "+ans);
        return ans;
    }

    //subtraction method
    public String subtraction(String num1, String num2) {
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        String ans=String.valueOf(a-b);
        history.push("sub( "+num1+", "+num2+") = "+ans);
        return ans;
    }

    //Multiplication method
    public String multiplication(String num1, String num2) {
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        String ans=String.valueOf(a*b);
        history.push("mul( "+num1+", "+num2+") = "+ans);
        return ans;
    }

    //Division method
    public String division(String num1, String num2) {
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        double val;
        try {
            val=(a/b);
            if(b==0){
                throw new ArithmeticException();
            }
        }catch (Exception e){
            return "Cant Divide by Zero";
        }
        String ans=String.valueOf(val);
        history.push("div( "+num1+", "+num2+") = "+ans);
        return ans;
    }

    //Percentage method
    public String percentage(String num1, String num2) {
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        Double val;
        try {
            val=(a/b);
            val=val*100;
            if(b==0){
                throw new ArithmeticException();
            }
        }catch (Exception e){
            return "Cant Divide by Zero";
        }
        String ans=String.valueOf(val);
        history.push("percentage( "+num1+", "+num2+") = "+ans);
        return ans;
    }

    //Logarithmic method
    public String logarithmic(String num1,String num2) {
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        Double val;
        try {
            val=Math.log10(a/b);
        }catch (Exception e){
            return "Cant Divide by Zero";
        }
        String ans=String.valueOf(val);
        history.push("(Log "+num1+", "+num2+") = "+ans);
        return ans;
    }

    //Show History
    public List<String> showHistory() {
        List<String> data = new ArrayList<>(history);
        return data;
    }
}
