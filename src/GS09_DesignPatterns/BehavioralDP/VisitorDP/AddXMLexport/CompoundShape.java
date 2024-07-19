package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

import java.util.ArrayList;
import java.util.List;

// The CompoundShape class implements the Shape interface and can contain other shapes.
class CompoundShape implements Shape {
    private List<Shape> children = new ArrayList<>();
    private int id;

    public CompoundShape(int id) {
        this.id = id;
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public void remove(Shape shape) {
        children.remove(shape);
    }

    public void move(int x, int y) {
        // Move this compound shape and all its children
        for (Shape shape : children) {
            shape.move(x, y);
        }
    }

    public void draw() {
        System.out.println("Drawing compound shape with ID: " + id);
        for (Shape shape : children) {
            shape.draw();
        }
    }

    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
        for (Shape shape : children) {
            shape.accept(visitor);
        }
    }

    public int getId() { return id; }

    public List<Shape> getChildren() {
        return children;
    }
}

