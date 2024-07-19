package GS09_DesignPatterns.BehavioralDP.StateDP.MediaPlayer;

// The UserInterface class is used to simulate the UI components and their interactions.
class UserInterface {
    public Button lockButton = new Button();
    public Button playButton = new Button();
    public Button nextButton = new Button();
    public Button prevButton = new Button();
}

class Button {
    private Runnable onClick;

    public void onClick(Runnable onClick) {
        this.onClick = onClick;
    }

    public void click() {
        if (onClick != null) {
            onClick.run();
        }
    }
}

