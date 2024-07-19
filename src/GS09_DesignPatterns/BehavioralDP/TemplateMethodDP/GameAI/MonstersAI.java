package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP.GameAI;

// Concrete class implementing all abstract operations of the base class.
class MonstersAI extends GameAI {

    @Override
    protected void collectResources() {
        // Monsters don't collect resources.
        System.out.println("MonstersAI does not collect resources.");
    }

    @Override
    protected void buildStructures() {
        // Monsters don't build structures.
        System.out.println("MonstersAI does not build structures.");
    }

    @Override
    protected void buildUnits() {
        // Monsters don't build units.
        System.out.println("MonstersAI does not build units.");
    }

    @Override
    protected void sendScouts(Position position) {
        // Monsters don't send scouts.
        System.out.println("MonstersAI does not send scouts.");
    }

    @Override
    protected void sendWarriors(Position position) {
        // Monsters send warriors if they have any.
        System.out.println("MonstersAI sending warriors to position (" + position.x + ", " + position.y + ").");
    }
}

