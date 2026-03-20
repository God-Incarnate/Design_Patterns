package behavioral_patterns.state_pattern;

public class MusicPlayer {
    private State state;

    public void setState(State state){
        this.state=state;
    }

    public void pressButton(){
        state.handle();
    }
}
