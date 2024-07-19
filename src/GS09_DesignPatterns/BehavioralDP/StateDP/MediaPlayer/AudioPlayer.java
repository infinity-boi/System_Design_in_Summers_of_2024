package GS09_DesignPatterns.BehavioralDP.StateDP.MediaPlayer;

// The AudioPlayer class acts as a context. It also maintains a reference to an instance
// of one of the state classes that represents the current state of the audio player.
class AudioPlayer {
    private State state;
    private UserInterface UI;
    private boolean playing;
    private boolean doubleClicked;

    public AudioPlayer() {
        this.state = new ReadyState(this);
        this.UI = new UserInterface();
        this.playing = false;
        this.doubleClicked = false;

        // Context delegates handling user input to a state object.
        // Naturally, the outcome depends on what state is currently active,
        // since each state can handle the input differently.
        UI.lockButton.onClick(this::clickLock);
        UI.playButton.onClick(this::clickPlay);
        UI.nextButton.onClick(this::clickNext);
        UI.prevButton.onClick(this::clickPrevious);
    }

    // Other objects must be able to switch the audio player's active state.
    public void changeState(State state) {
        this.state = state;
    }

    // UI methods delegate execution to the active state.
    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }

    // A state may call some service methods on the context.
    public void startPlayback() {
        this.playing = true;
        System.out.println("Playback started.");
    }

    public void stopPlayback() {
        this.playing = false;
        System.out.println("Playback stopped.");
    }

    public void nextSong() {
        System.out.println("Playing next song.");
    }

    public void previousSong() {
        System.out.println("Playing previous song.");
    }

    public void fastForward(int time) {
        System.out.println("Fast forwarding " + time + " seconds.");
    }

    public void rewind(int time) {
        System.out.println("Rewinding " + time + " seconds.");
    }

    public boolean isPlaying() {
        return playing;
    }

    public boolean isDoubleClicked() {
        // This method should return true if the button was double-clicked.
        return doubleClicked;
    }

    public void setDoubleClicked(boolean doubleClicked) {
        this.doubleClicked = doubleClicked;
    }
}

