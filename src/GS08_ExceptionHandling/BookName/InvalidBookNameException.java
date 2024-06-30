package GS08_ExceptionHandling.BookName;

public class InvalidBookNameException extends Exception{
    public InvalidBookNameException(String message){
        super(message);
    }
}
