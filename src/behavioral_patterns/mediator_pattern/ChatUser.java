package behavioral_patterns.mediator_pattern;

class ChatUser extends User {

    public ChatUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {

        System.out.println(name + " sends: " + message);

        mediator.sendMessage(message, this);
    }

    public void receive(String message) {

        System.out.println(name + " receives: " + message);
    }
}
