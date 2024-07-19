package GS09_DesignPatterns.StructuralDP.CompositeDP.ImageEditor;

import java.util.Arrays;

public class ImageEditorDemo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.load();

        // Drawing all components initially loaded
        editor.draw();

        // Grouping selected components
        editor.groupSelected(Arrays.asList(new Dot(1, 2), new Circle(5, 3, 10)));

        // Drawing all components after grouping
        editor.draw();
    }
}
