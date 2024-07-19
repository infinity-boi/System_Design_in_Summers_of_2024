package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

// The Dot class implements the Shape interface.
class Dot implements Shape {
    private int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing a dot at (" + x + ", " + y + ")");
    }

    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

