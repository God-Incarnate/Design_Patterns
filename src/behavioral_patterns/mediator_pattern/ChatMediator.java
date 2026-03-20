package behavioral_patterns.mediator_pattern;

import java.util.ArrayList;
import java.util.List;

class ChatMediator implements Mediator {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User sender) {

        for(User user : users) {

            if(user != sender)
                user.receive(message);
        }
    }
}
