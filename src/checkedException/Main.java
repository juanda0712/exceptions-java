package checkedException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Excepcion Check para edad con valor negativo ");
        System.out.print("Ingrese la edad de la persona: ");
        int a = input.nextInt();

        try{
            Person person = new Person();
            person.setAge(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
