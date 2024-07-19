package GS09_DesignPatterns.BehavioralDP.StateDP.MediaPlayer;

// The base state class declares methods that all concrete states should implement
// and also provides a backreference to the context object associated with the state.
// States can use the backreference to transition the context to another state.
abstract class State {
    protected AudioPlayer player;

    public State(AudioPlayer player) {
        this.player = player;
    }

    public abstract void clickLock();
    public abstract void clickPlay();
    public abstract void clickNext();
    public abstract void clickPrevious();
}

