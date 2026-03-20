package behavioral_patterns.state_pattern;

public class PlayingState implements State{
    public void handle(){
        System.out.println("Music is playing");
    }
}
