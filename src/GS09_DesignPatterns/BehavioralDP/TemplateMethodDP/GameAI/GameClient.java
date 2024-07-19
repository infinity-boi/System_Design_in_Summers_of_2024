package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP.GameAI;

public class GameClient {
    public static void main(String[] args) {
        // Example usage of the AI classes.

        GameAI orcAI = new OrcsAI();
        orcAI.turn(); // Executes the template method in OrcsAI.

        GameAI monsterAI = new MonstersAI();
        monsterAI.turn(); // Executes the template method in MonstersAI.
    }
}

