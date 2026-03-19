package creational_patterns.builder_patterns.step_builder_pattern;

/*
4️⃣ Step Builder Pattern

Used when certain fields must be set in order.

Example:

Message → Recipient → Channel → Build

Usage:::::::::::::::::::::;;
Notification n = new Notification.Builder()
        .message("Hello")
        .channel("EMAIL")
        .build();
 */
public class Notification {

    private String message;
    private String channel;

    private Notification(){}

    public interface MessageStep {
        ChannelStep message(String msg);
    }

    public interface ChannelStep {
        BuildStep channel(String channel);
    }

    public interface BuildStep {
        Notification build();
    }

    public static class Builder
            implements MessageStep, ChannelStep, BuildStep {

        private Notification notification = new Notification();

        public ChannelStep message(String msg) {
            notification.message = msg;
            return this;
        }

        public BuildStep channel(String channel) {
            notification.channel = channel;
            return this;
        }

        public Notification build() {
            return notification;
        }
    }
}
