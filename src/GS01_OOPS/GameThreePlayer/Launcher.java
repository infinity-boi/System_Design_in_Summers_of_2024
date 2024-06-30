package GS01_OOPS.GameThreePlayer;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args){
        List<String> playerNames = new ArrayList<>();
        playerNames.add("Gourav");
        playerNames.add("Raghav");
        playerNames.add("Divyanshu");
        playerNames.add("Aditya");
        Game g = new Game(playerNames);
        g.play();
    }
}
