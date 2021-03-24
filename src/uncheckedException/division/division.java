package checkedException.division;

public class division {

    /*
     * this function has an exception handling Checked
     * the function that calls this function should handle the exception
     * the function is declared with with throws */
    public static Double division(Double a, Double b)throws Exception{
        if (b == 0){
            throw new Exception("El divisor no puede ser 0");
        }
        return a / b;
    }
}
