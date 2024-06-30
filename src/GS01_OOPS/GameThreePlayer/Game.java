package GS01_OOPS.GameThreePlayer;

import java.util.ArrayList;
import java.util.List;

public class Game {
    int machineGuess;
    List<Player> playerList;

    Game(List<String> names){
        playerList = new ArrayList<>();
        for(String name: names){
            playerList.add(new Player(name));
        }
    }

    private boolean checkWinner(){
        for(Player p: playerList){
            if(p.getGuess()== machineGuess){
                System.out.println(p.name + " Won");
                return true;
            }
        }
        return false;
    }

    void play(){
        while(true){
            machineGuess = (int)(Math.random()*10);
            for(Player p : playerList){
                p.makeGuess();
            }
            System.out.println("Machine guessed " + machineGuess);
            if(checkWinner()){
                System.out.println("Game Over");
                break;
            }
        }
    }

}
