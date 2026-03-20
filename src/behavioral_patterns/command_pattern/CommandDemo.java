package behavioral_patterns.command_pattern;

/*
1️⃣ What is the Command Pattern?

The Command Pattern is a Behavioral Design Pattern that encapsulates a request as an object.

This means:

Instead of calling methods directly, we wrap the request inside a command object, which can then be executed later.

This allows us to:

queue requests

log requests

undo operations

decouple sender and receiver

In simple terms:

Client → Command → Receiver

The client does not directly call the receiver.

2️⃣ Real-Life Analogy
📺 Remote Control Example

Imagine a TV Remote.

You press a button:

Remote Button → Command → TV

The remote does not know how the TV works internally.

It only sends a command.

Example commands:

TurnOnCommand
TurnOffCommand
VolumeUpCommand

Each button stores a command object.

3️⃣ Problem Without Command Pattern

Without command pattern:

class RemoteControl {

    TV tv;

    public void pressButton() {
        tv.turnOn();
    }
}

Problems:

Issue	Explanation
Tight coupling	Remote must know TV class
Hard to extend	Adding new devices requires modification
Cannot queue commands	No object representing request
No undo support	Requests not stored
4️⃣ Command Pattern Solution

We wrap actions inside command objects.

Structure:

Client → Invoker → Command → Receiver

Example:

RemoteControl → TurnOnCommand → TV

Now the remote only executes commands.

5️⃣ Structure of Command Pattern

General structure:

Client → Invoker → Command Interface
                         |
                -------------------
                |                 |
        ConcreteCommand1    ConcreteCommand2
                |
             Receiver
6️⃣ Components of Command Pattern
Component	Role
Command	Interface for executing command
ConcreteCommand	Implements command
Receiver	Performs actual work
Invoker	Executes command
Client	Creates command
 */
public class CommandDemo {
    static void main(String[] args){
        Light tubelight=new Light();

        LightOnCommand lightOn=new LightOnCommand(tubelight);
        LightOffCommand lightOff=new LightOffCommand(tubelight);

        Remote tubelightRemote=new Remote();

        tubelightRemote.setCommand(lightOn);
        tubelightRemote.pressButton();

        tubelightRemote.setCommand(lightOff);
        tubelightRemote.pressButton();
    }
}
/*
1️⃣2️⃣ Execution Flow

Step 1 – Create receiver

Light

Step 2 – Create commands

LightOnCommand
LightOffCommand

Step 3 – Set command in invoker

RemoteControl

Step 4 – Execute command

remote.pressButton()
1️⃣3️⃣ Output
Light is ON
Light is OFF
1️⃣4️⃣ Visual Flow
Client
  |
RemoteControl (Invoker)
  |
Command
  |
LightOnCommand
  |
Light (Receiver)
 */