package behavioral_patterns.state_pattern;

class StoppedState implements State {

    public void handle() {
        System.out.println("Music stopped");
    }
}
