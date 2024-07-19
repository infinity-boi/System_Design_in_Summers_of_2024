package GS09_DesignPatterns.BehavioralDP.StateDP.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        // Simulate user interactions
        player.clickPlay();      // Start playback
        player.clickNext();      // Go to the next song
        player.clickLock();      // Lock the player
        player.clickPlay();      // Attempt to play (nothing happens because it's locked)
        player.clickLock();      // Unlock the player
        player.clickPlay();      // Stop playback
    }
}

