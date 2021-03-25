package uncheckedException.division;

public class Division {

    /*
     * this function has an exception handling Checked
     * the function that calls this function should handle the exception
     * the function is declared with with throws */
    public static Double division(Double a, Double b){
        if (b == 0){
            throw new RuntimeException("El divisor no puede ser 0");
        }
        return a / b;
    }
}
