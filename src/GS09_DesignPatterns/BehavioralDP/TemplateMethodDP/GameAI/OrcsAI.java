package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP.GameAI;

// Concrete class implementing all abstract operations of the base class.
class OrcsAI extends GameAI {

    @Override
    protected void buildStructures() {
        // Example implementation for OrcsAI to build structures.
        // Build farms, then barracks, then stronghold.
        System.out.println("OrcsAI building farms, barracks, and stronghold.");
    }

    @Override
    protected void buildUnits() {
        // Example implementation for OrcsAI to build units.
        // Build peon if no scouts, otherwise build grunt.
        System.out.println("OrcsAI building units.");
    }

    @Override
    protected void sendScouts(Position position) {
        // Example implementation for sending scouts.
        System.out.println("OrcsAI sending scouts to position (" + position.x + ", " + position.y + ").");
    }

    @Override
    protected void sendWarriors(Position position) {
        // Example implementation for sending warriors.
        System.out.println("OrcsAI sending warriors to position (" + position.x + ", " + position.y + ").");
    }
}
