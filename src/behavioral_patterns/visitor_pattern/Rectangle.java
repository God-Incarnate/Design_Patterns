package behavioral_patterns.visitor_pattern;

class Rectangle implements Shape {

    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
