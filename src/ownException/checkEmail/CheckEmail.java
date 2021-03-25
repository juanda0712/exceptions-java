package ownException.checkEmail;

import ownException.mailLengthError.MailLengthError;

public class CheckEmail{

    /*
    * Examine the email and verify that it is a valid email and
    * that it has an acceptable length (greater than 3 characters)
    * */
    public static void examineEmail(String email) throws MailLengthError {
        int atSign = 0;
        boolean dot = false;

        if (email.length() <=3){
            //Exception
            throw new MailLengthError("El correo es demasiado corto");

        }else{
            for(int i =0; i< email.length();i++){

                if(email.charAt(i) == '@'){
                    atSign++;
                }

                if (email.charAt(i) == '.'){
                    dot = true;
                }
            }
            if (atSign==1 && dot==true){
                System.out.println("El correo es correcto");
            }else{
                System.out.println("El correo es incorrecto");
            }
        }

    }
}
