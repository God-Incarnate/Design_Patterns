package behavioral_patterns.template_pattern;

class Coffee extends Beverage {

    void brew() {
        System.out.println("Brewing coffee");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
