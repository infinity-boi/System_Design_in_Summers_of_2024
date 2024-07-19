package GS09_DesignPatterns.BehavioralDP.StateDP.MediaPlayer;

// Concrete states implement various behaviors associated with a state of the context.

class LockedState extends State {
    public LockedState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        if (player.isPlaying()) {
            player.changeState(new PlayingState(player));
        } else {
            player.changeState(new ReadyState(player));
        }
    }

    @Override
    public void clickPlay() {
        // Locked, so do nothing.
    }

    @Override
    public void clickNext() {
        // Locked, so do nothing.
    }

    @Override
    public void clickPrevious() {
        // Locked, so do nothing.
    }
}

class ReadyState extends State {
    public ReadyState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickNext() {
        player.nextSong();
    }

    @Override
    public void clickPrevious() {
        player.previousSong();
    }
}

class PlayingState extends State {
    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
    }

    @Override
    public void clickNext() {
        if (player.isDoubleClicked()) {
            player.nextSong();
        } else {
            player.fastForward(5);
        }
    }

    @Override
    public void clickPrevious() {
        if (player.isDoubleClicked()) {
            player.previousSong();
        } else {
            player.rewind(5);
        }
    }
}

