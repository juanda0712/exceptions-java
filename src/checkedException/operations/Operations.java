package checkedException.operations;

public class Operations {

    /**
     * this function has an exception handling Checked
     * the function that calls this function should handle the exception*/
    public static Double division(Double a, Double b)throws Exception{
        if (b == 0){
            throw new Exception("El divisor no puede ser 0");
        }
        return a / b;
    }
}
