package behavioral_patterns.visitor_pattern;

class DisplayVisitor implements ShapeVisitor {

    public void visit(Circle circle) {

        System.out.println(
                "Drawing Circle radius " + circle.radius);
    }

    public void visit(Rectangle rectangle) {

        System.out.println(
                "Drawing Rectangle "
                        + rectangle.width + "x" + rectangle.height);
    }
}
