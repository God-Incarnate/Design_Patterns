package behavioral_patterns.state_pattern;

/*
5️⃣ State Pattern
1️⃣ Purpose

The State Pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes.

Instead of writing large if-else or switch conditions based on state, the behavior is moved into separate state classes.

Key Idea

The object behaves differently depending on its current state, and the state can change at runtime.

Concept:

Context → State → Different Behavior
2️⃣ Problem Without State Pattern

Suppose we build a media player.

Example implementation:

class MediaPlayer {

    String state = "STOPPED";

    public void pressPlay() {

        if(state.equals("STOPPED")) {
            System.out.println("Playing music");
            state = "PLAYING";
        }
        else if(state.equals("PLAYING")) {
            System.out.println("Pausing music");
            state = "PAUSED";
        }
        else if(state.equals("PAUSED")) {
            System.out.println("Resuming music");
            state = "PLAYING";
        }
    }
}

Problems:

Problem	Explanation
Too many conditions	if-else grows quickly
Hard to extend	Adding new states becomes messy
Violates Open/Closed Principle	Must modify existing code

The State Pattern solves this.

3️⃣ Real-World Analogy
🚦 Traffic Light

Traffic light has states:

RED
YELLOW
GREEN

Behavior depends on state.

Example:

State	Behavior
RED	Stop vehicles
GREEN	Allow vehicles
YELLOW	Prepare to stop

Instead of writing conditions everywhere, each state defines its own behavior.

4️⃣ Structure of State Pattern

General structure:

Client
   |
Context
   |
State (interface)
   |
-------------------------
|           |           |
StateA     StateB     StateC
5️⃣ Components of State Pattern
Component	Role
Context	Object whose behavior changes
State	Interface defining state behavior
ConcreteState	Implementation for each state
Client	Interacts with context
 */
public class StateDemo {
    static void main(String[] args){
        MusicPlayer player=new MusicPlayer();

        player.setState(new PlayingState());
        player.pressButton();

        player.setState(new PausedState());
        player.pressButton();

        player.setState(new StoppedState());
        player.pressButton();
    }
}
/*
🔟 Output
Music is playing
Music is paused
Music stopped
1️⃣1️⃣ Execution Flow

Step 1 – Context created

MusicPlayer

Step 2 – State assigned

PlayingState

Step 3 – Behavior executed

state.handle()
1️⃣2️⃣ Visual Flow
Client
  |
MusicPlayer (Context)
  |
State Interface
  |
-------------------------
|          |            |
Playing   Paused      Stopped
State      State        State

The context delegates behavior to current state.
 */
