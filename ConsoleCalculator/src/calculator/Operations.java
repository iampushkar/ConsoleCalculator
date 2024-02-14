package calculator;
/**
 *  add
    sub
    multiply
    divide
    modulus
    factorial
    root
    exponential
    log
    percentage
    sine 
    cosine
    conversions
 */
public class Operations {
    
    public int add(int num1 , int num2){
        return Math.addExact(num1, num2);
    }

    public int sub(int num1 , int num2){
        return Math.subtractExact(num1, num2);
    }

    public int multiply(int num1 , int num2){
        return Math.multiplyExact(num1, num2);
    }

    public int divide(int num1 , int num2){
        if(num2 == 0){
            return -1;
        }

        return num1 / num2;
    }
}
