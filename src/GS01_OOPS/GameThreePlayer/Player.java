package GS01_OOPS.GameThreePlayer;

public class Player {
    public String name;
    private int guess;

    public Player(String name){
        this.name = name;
    }

    public int getGuess(){
        return guess;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", guess=" + guess +
                '}';
    }

    private int getRandomNumber(){
        return (int)(Math.random()*10);
    }

    public void makeGuess(){
        this.guess = getRandomNumber();
        System.out.println(name + " guessed "+ guess);
    }

    public void updateGuess(int newGuess){
        if(newGuess>=1 && newGuess<=9){
            this.guess = newGuess;
        }
        else{
            this.guess = getRandomNumber();
        }
    }
}

