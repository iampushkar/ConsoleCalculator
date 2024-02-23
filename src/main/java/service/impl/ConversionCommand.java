package src.main.java.service.impl;

import src.main.java.service.Command;

public class ConversionCommand implements Command {
    double result= 0.0;
    @Override
    public void execute(double num, String fromUnit){
        if (fromUnit.substring(1).equalsIgnoreCase("meters") ) {//&& toUnit.equalsIgnoreCase("feet")) {
            result = num * 3.28084; // 1 meter = 3.28084 feet
        } else if (fromUnit.substring(1).equalsIgnoreCase("feet") ){//&& toUnit.equalsIgnoreCase("meters")) {
            result = num / 3.28084; // 1 foot = 0.3048 meters
        } else {
            System.out.println("Conversion not supported");
        }
        System.out.println("Result is : " + result);
    }

}
