package behavioral_patterns.interpretor_pattern;

class SubtractExpression implements Expression {

    private Expression left;
    private Expression right;

    public SubtractExpression(Expression left,
                              Expression right) {

        this.left = left;
        this.right = right;
    }

    public int interpret() {

        return left.interpret()
                - right.interpret();
    }
}
