package behavioral_patterns.interpretor_pattern;

class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}
