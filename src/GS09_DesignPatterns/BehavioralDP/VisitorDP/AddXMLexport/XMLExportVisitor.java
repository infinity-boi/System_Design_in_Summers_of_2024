package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

// Concrete visitor that implements XML export functionality.
class XMLExportVisitor implements Visitor {
    public void visitDot(Dot dot) {
        System.out.println("<dot>");
        System.out.println("  <x>" + dot.getX() + "</x>");
        System.out.println("  <y>" + dot.getY() + "</y>");
        System.out.println("</dot>");
    }

    public void visitCircle(Circle circle) {
        System.out.println("<circle>");
        System.out.println("  <x>" + circle.getX() + "</x>");
        System.out.println("  <y>" + circle.getY() + "</y>");
        System.out.println("  <radius>" + circle.getRadius() + "</radius>");
        System.out.println("</circle>");
    }

    public void visitRectangle(Rectangle rectangle) {
        System.out.println("<rectangle>");
        System.out.println("  <x>" + rectangle.getX() + "</x>");
        System.out.println("  <y>" + rectangle.getY() + "</y>");
        System.out.println("  <width>" + rectangle.getWidth() + "</width>");
        System.out.println("  <height>" + rectangle.getHeight() + "</height>");
        System.out.println("</rectangle>");
    }

    public void visitCompoundShape(CompoundShape compoundShape) {
        System.out.println("<compoundShape id=\"" + compoundShape.getId() + "\">");
        for (Shape shape : compoundShape.getChildren()) {
            shape.accept(this);
        }
        System.out.println("</compoundShape>");
    }
}

