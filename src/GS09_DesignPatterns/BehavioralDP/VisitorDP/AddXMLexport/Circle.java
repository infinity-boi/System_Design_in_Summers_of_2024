package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

// The Circle class implements the Shape interface.
class Circle implements Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getRadius() { return radius; }
}

