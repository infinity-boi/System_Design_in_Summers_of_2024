package GS09_DesignPatterns.BehavioralDP.TemplateMethodDP.GameAI;

import java.util.ArrayList;
import java.util.List;

// The abstract class defines a template method that contains a skeleton of some algorithm.
abstract class GameAI {
    // The template method defines the skeleton of an algorithm.
    public void turn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    // Some of the steps may be implemented right in the base class.
    protected void collectResources() {
        for (Structure s : this.builtStructures) {
            s.collect();
        }
    }

    // Abstract methods that must be implemented by subclasses.
    protected abstract void buildStructures();
    protected abstract void buildUnits();
    protected abstract void sendScouts(Position position);
    protected abstract void sendWarriors(Position position);

    // A class can have several template methods.
    private void attack() {
        Position enemy = closestEnemy();
        if (enemy == null) {
            sendScouts(mapCenter());
        } else {
            sendWarriors(enemy);
        }
    }

    // These methods can be implemented in base class or can be left abstract.
    protected Position closestEnemy() {
        // Placeholder implementation to find the closest enemy
        return null;
    }

    protected Position mapCenter() {
        // Placeholder implementation to get the map center
        return new Position(0, 0);
    }

    // Example structures and positions
    private List<Structure> builtStructures = new ArrayList<>();

    protected class Position {
        int x, y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    protected abstract class Structure {
        public abstract void collect();
    }
}

