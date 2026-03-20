package behavioral_patterns.visitor_pattern;

class AreaVisitor implements ShapeVisitor {

    public void visit(Circle circle) {

        double area =
                Math.PI * circle.radius * circle.radius;

        System.out.println("Circle area: " + area);
    }

    public void visit(Rectangle rectangle) {

        int area =
                rectangle.width * rectangle.height;

        System.out.println("Rectangle area: " + area);
    }
}
