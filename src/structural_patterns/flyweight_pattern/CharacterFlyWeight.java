package structural_patterns.flyweight_pattern;

public class CharacterFlyWeight {
    private char character;

    public CharacterFlyWeight(char c){
        this.character=c;
    }

    public void displayChar(){
        System.out.println(character);
    }
}
