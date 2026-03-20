package behavioral_patterns.template_pattern;

class Tea extends Beverage {

    void brew() {
        System.out.println("Steeping tea leaves");
    }

    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
