package GS01_OOPS.PaymentSystem;

public class UPI implements PaymentMethod {
    String handle;
    int accountNo;

    public UPI(String handle,int accountNo){
        this.handle = handle;
        this.accountNo = accountNo;
    }

    @Override
    public void pay() {
        System.out.println(handle + " is making payment via UPI from " + accountNo);
        //business logic
    }
}