package GS09_DesignPatterns.BehavioralDP.MediatorDP.AccountManager;

// The concrete mediator class. The intertwined web of connections between individual components has been untangled and moved into the mediator.
class AuthenticationDialog implements Mediator {
    private String title;
    Checkbox loginOrRegisterChkBx;
    Textbox loginUsername;
    Textbox loginPassword;
    Textbox registrationUsername;
    Textbox registrationPassword;
    Textbox registrationEmail;
    Button okBtn;
    private Button cancelBtn;

    public AuthenticationDialog() {
        // Create all component objects by passing the current mediator into their constructors to establish links.
        loginOrRegisterChkBx = new Checkbox(this);
        loginUsername = new Textbox(this);
        loginPassword = new Textbox(this);
        registrationUsername = new Textbox(this);
        registrationPassword = new Textbox(this);
        registrationEmail = new Textbox(this);
        okBtn = new Button(this);
        cancelBtn = new Button(this);
    }

    // When something happens with a component, it notifies the mediator. Upon receiving a notification, the mediator may do something on its own or pass the request to another component.
    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkBx && event.equals("check")) {
            if (loginOrRegisterChkBx.isChecked()) {
                title = "Log in";
                // 1. Show login form components.
                showLoginComponents();
                // 2. Hide registration form components.
                hideRegistrationComponents();
            } else {
                title = "Register";
                // 1. Show registration form components.
                showRegistrationComponents();
                // 2. Hide login form components.
                hideLoginComponents();
            }
        }

        if (sender == okBtn && event.equals("click")) {
            if (loginOrRegisterChkBx.isChecked()) {
                // Try to find a user using login credentials.
                if (!findUser(loginUsername.getText(), loginPassword.getText())) {
                    // Show an error message above the login field.
                    showError("User not found");
                }
            } else {
                // 1. Create a user account using data from the registration fields.
                createUser(registrationUsername.getText(), registrationPassword.getText(), registrationEmail.getText());
                // 2. Log that user in.
                logInUser(registrationUsername.getText());
            }
        }
    }

//    @Override
//    public void notify(Component sender, String event) {
//        if (sender == loginOrRegisterChkBx && event.equals("check")) {
//            boolean isChecked = loginOrRegisterChkBx.isChecked();
//            title = isChecked ? "Log in" : "Register";
//            ui.updateFormVisibility(isChecked);
//        } else if (sender == okBtn && event.equals("click")) {
//            if (loginOrRegisterChkBx.isChecked()) {
//                if (!tryLogin(loginUsername.getText(), loginPassword.getText())) {
//                    showError("User not found");
//                } else {
//                    // Login successful, handle it (e.g., close dialog)
//                    System.out.println("Login successful!");
//                }
//            } else {
//                registerUser(registrationUsername.getText(), registrationPassword.getText(), registrationEmail.getText());
//                logInUser(registrationUsername.getText());
//            }
//        }
//    }

    private void showLoginComponents() {
        // Show loginUsername and loginPassword
    }

    private void hideLoginComponents() {
        // Hide loginUsername and loginPassword
    }

    private void showRegistrationComponents() {
        // Show registrationUsername, registrationPassword, and registrationEmail
    }

    private void hideRegistrationComponents() {
        // Hide registrationUsername, registrationPassword, and registrationEmail
    }

    private boolean findUser(String username, String password) {
        // Simulate finding a user
        return false; // For simplicity, always return false
    }

    private void showError(String message) {
        // Show an error message
        System.out.println(message);
    }

    private void createUser(String username, String password, String email) {
        // Simulate user creation
        System.out.println("User created: " + username);
    }

    private void logInUser(String username) {
        // Simulate user login
        System.out.println("User logged in: " + username);
    }

//    private boolean tryLogin(String username, String password) {
//        // Implement logic to find user with credentials and return success
//        // (replace "return false" with actual logic)
//        return userService.findUser(username, password) != null;
//    }
//
//    private void registerUser(String username, String password, String email) {
//        // Implement logic to create a user account (replace with actual logic)
//        userService.createUser(username, password, email);
//    }
}
