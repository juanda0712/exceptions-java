package ownException;

public class MailLengthError extends Exception{

    public MailLengthError(){}

    public MailLengthError(String errorMsg){
        super(errorMsg);
    }
}
