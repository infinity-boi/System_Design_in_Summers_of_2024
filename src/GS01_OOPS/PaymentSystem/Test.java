package GS01_OOPS.PaymentSystem;

public class Test {
    public static void main(String[] args){
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("GouravSBI", new DebitCard("149345934023450" , "Gourav Singh", 12112430));
        ps.addPaymentMethod("GouravCred", new CreditCard("2232403420430520" , "Gourav Singh"));
        ps.addPaymentMethod("GouravUPI", new UPI("gourav@paytm" ,  12112430));
        ps.addPaymentMethod("GouravICICI", new DebitCard("230343040242" , "Gourav Singh", 24040024));
        ps.makePayment("GouravSBI");
        ps.makePayment("GouravCred");
        ps.makePayment("GouravUPI");
        ps.makePayment("GouravICICI");
    }
}
