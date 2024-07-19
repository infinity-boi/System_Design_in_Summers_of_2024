package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

public class Application {
    public static void main(String[] args) {
        // Create shapes
        Dot dot = new Dot(1, 2);
        Circle circle = new Circle(3, 4, 5);
        Rectangle rectangle = new Rectangle(6, 7, 8, 9);

        // Create compound shape and add shapes to it
        CompoundShape compoundShape = new CompoundShape(100);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        // Create XML export visitor
        XMLExportVisitor xmlExportVisitor = new XMLExportVisitor();

        // Export all shapes to XML
        System.out.println("Exporting shapes to XML:");
        dot.accept(xmlExportVisitor);
        circle.accept(xmlExportVisitor);
        rectangle.accept(xmlExportVisitor);
        compoundShape.accept(xmlExportVisitor);
    }
}
