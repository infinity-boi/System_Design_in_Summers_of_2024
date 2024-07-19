package GS09_DesignPatterns.StructuralDP.CompositeDP.ImageEditor;

import java.util.List;

class ImageEditor {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(6, 12, 8));
        // ...
    }

    public void groupSelected(List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.add(component);
            all.remove(component);
        }
        all.add(group);
        all.draw();
    }

    public void draw() {
        if (all != null) {
            all.draw();
        }
    }
}
