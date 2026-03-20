package behavioral_patterns.visitor_pattern;

interface Shape {

    void accept(ShapeVisitor visitor);
}