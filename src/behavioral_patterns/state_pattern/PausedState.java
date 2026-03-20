package behavioral_patterns.state_pattern;

public class PausedState implements State {
    public void handle() {
        System.out.println("Music is paused");
    }
}
