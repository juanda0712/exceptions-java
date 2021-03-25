package uncheckedException;

import uncheckedException.division.Division;
import java.util.Scanner;

//This example implements an exception for when a number is divided by zero
//Input: 2 numbers
//output: division
public class MainUnchecked {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Excepcion Unchecked para cuando el divisor(segundo numero es cero)");
        System.out.print("Ingrese el primer numero: ");
        Double a =input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        Double b = input.nextDouble();

        Double result = Division.division(a,b);
        System.out.printf("Resultado: %.1f",result);

    }
}
