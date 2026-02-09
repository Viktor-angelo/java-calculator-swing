package model;

/**
 *
 * @author viktor angelo
 */
public class CalculatorService{
    public static int remainbyTwo(int n ){
        return n %2;
    }
    public static double cube(double n ){
        return Math.pow(n,3);
    }
    public static double squareRoot(double n){
        return Math.sqrt(n);
    }
    public static double cubeRoot(double n){
        return Math.cbrt(n);
    }
    public static int absoluteValue(int n){
        return Math.abs(n);
    }
};
