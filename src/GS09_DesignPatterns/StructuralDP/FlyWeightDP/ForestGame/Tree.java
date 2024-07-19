package GS09_DesignPatterns.StructuralDP.FlyWeightDP.ForestGame;

class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(String canvas) {
        type.draw(canvas, x, y);
    }
}

