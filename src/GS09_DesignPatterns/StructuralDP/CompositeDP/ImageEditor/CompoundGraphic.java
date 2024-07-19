package GS09_DesignPatterns.StructuralDP.CompositeDP.ImageEditor;

import java.util.ArrayList;
import java.util.List;

class CompoundGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a compound graphic:");
        for (Graphic child : children) {
            child.draw();
        }
    }
}
