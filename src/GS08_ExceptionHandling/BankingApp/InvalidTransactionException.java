package GS08_ExceptionHandling.BankingApp;

public class InvalidTransactionException extends Exception{
    public InvalidTransactionException(String msg){
        super(msg);
    }
}
