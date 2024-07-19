package GS09_DesignPatterns.BehavioralDP.MediatorDP.AccountManager;

// Concrete components don't talk to each other. They have only one communication channel, which is sending notifications to the mediator.
class Button extends Component {
    public Button(Mediator dialog) {
        super(dialog);
    }

    // Button-specific methods
}

class Textbox extends Component {
    private String text;

    public Textbox(Mediator dialog) {
        super(dialog);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Textbox-specific methods
}

class Checkbox extends Component {
    private boolean checked;

    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        check();
    }

    public void check() {
        dialog.notify(this, "check");
    }
}
