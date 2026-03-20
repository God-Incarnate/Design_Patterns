package behavioral_patterns.visitor_pattern;

interface ShapeVisitor {

    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
