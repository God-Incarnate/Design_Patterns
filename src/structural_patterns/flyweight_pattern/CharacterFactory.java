package structural_patterns.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<Character,CharacterFlyWeight> map=new HashMap<>();

    public static CharacterFlyWeight getChar(char c){
        if(!map.containsKey(c)){
            map.put(c,new CharacterFlyWeight(c));
        }
        return map.get(c);
    }
}
