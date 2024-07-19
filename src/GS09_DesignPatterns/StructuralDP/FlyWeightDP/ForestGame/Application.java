package GS09_DesignPatterns.StructuralDP.FlyWeightDP.ForestGame;

public class Application {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(0, 0, "Oak", "Green", "Smooth");
        forest.plantTree(1, 0, "Oak", "Green", "Smooth");
        forest.plantTree(0, 1, "Pine", "Green", "Rough");
        forest.plantTree(1, 1, "Pine", "Green", "Rough");
        forest.plantTree(2, 1, "Neem", "Dark Green", "Rough");
        forest.plantTree(4, 3, "Neem", "Dark Green", "Rough");
        forest.plantTree(3, 3, "Neem", "Light Green", "Rough");
        forest.plantTree(2, 3, "Neem", "Light Green", "Rough");
        forest.plantTree(1, 5, "Khejdi", "Brown", "Sharp");

        forest.draw("Canvas");
    }
}
