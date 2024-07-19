package GS09_DesignPatterns.BehavioralDP.VisitorDP.AddXMLexport;

// The Visitor interface declares a set of visiting methods that correspond to element classes.
interface Visitor {
    void visitDot(Dot dot);
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitCompoundShape(CompoundShape compoundShape);
}

