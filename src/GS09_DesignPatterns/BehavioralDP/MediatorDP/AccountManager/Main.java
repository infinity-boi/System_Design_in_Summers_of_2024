package GS09_DesignPatterns.BehavioralDP.MediatorDP.AccountManager;

// Client code to demonstrate the usage of the Mediator pattern.
public class Main {
    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();

        // Simulate user actions
        dialog.loginOrRegisterChkBx.setChecked(true); // Switch to login mode
        dialog.okBtn.click(); // Attempt to log in

        dialog.loginUsername.setText("existinguser");
        dialog.loginPassword.setText("password");
        dialog.okBtn.click(); // Attempt to log in

        dialog.loginOrRegisterChkBx.setChecked(false); // Switch to registration mode
        dialog.registrationUsername.setText("newuser");
        dialog.registrationPassword.setText("password");
        dialog.registrationEmail.setText("email@example.com");
        dialog.okBtn.click(); // Attempt to register and log in
    }
}
