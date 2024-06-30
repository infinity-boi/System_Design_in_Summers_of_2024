package GS08_ExceptionHandling.BankingApp;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg){
        super(msg);
    }
}
