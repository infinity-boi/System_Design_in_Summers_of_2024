package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

// The Rectangle class implements the Shape interface.
class Rectangle implements Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing a rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }

    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}

