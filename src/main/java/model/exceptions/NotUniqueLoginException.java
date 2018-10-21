package model.exceptions;

public class NotUniqueLoginException extends Exception {
    public NotUniqueLoginException (String value){
        super(value);
    }
}
