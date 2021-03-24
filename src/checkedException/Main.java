package checkedException;

import checkedException.operations.Operations;

public class Main {
    public static void main(String[] args) {
        //Checked Exception (zero division error)
        try{
            Double result = Operations.division(5.0,2.0);
            System.out.printf("Resultado: %.1f",result);
        }catch (Exception ex){
            System.out.println("No se puede dividir por cero");
        }

    }
}
