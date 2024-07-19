package GS09_DesignPatterns.StructuralDP.FlyWeightDP.ForestGame;

// Flyweight class
class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(String canvas, int x, int y) {
        System.out.println("Drawing a " + name + " tree of color " + color + " with texture " + texture + " at (" + x + ", " + y + ") on " + canvas);
    }
}

