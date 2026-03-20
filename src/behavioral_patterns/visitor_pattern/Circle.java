package behavioral_patterns.visitor_pattern;

class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
