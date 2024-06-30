package GS08_ExceptionHandling.BankingApp;

public class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String msg){
        super(msg);
    }
}
