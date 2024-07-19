package GS09_DesignPatterns.StructuralDP.CompositeDP.ImageEditor;

class Dot implements Graphic {
    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a dot at (" + x + ", " + y + ")");
    }
}

