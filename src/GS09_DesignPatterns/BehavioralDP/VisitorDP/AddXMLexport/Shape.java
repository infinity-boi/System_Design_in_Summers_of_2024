package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

// The Element interface declares an accept method that takes a visitor as an argument.
interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor visitor);
}

