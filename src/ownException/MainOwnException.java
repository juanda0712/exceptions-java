package ownException;

import java.util.Scanner;

public class MainOwnException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Verifica que el correo sea valido y cumpla con la longitud mínima (4 carateres),");
        System.out.println("si no cumple con la longitud mínima tira la excepción MailLengthError que se creó.");
        System.out.print("Ingrese el E-mail: ");
        String email =input.nextLine();

        try{
            CheckEmail.examineEmail(email);
        }catch (MailLengthError e){
            System.out.println(e.getMessage());
        }


    }
}
