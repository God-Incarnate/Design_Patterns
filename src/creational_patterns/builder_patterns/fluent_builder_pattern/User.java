package creational_patterns.builder_patterns.fluent_builder_pattern;

/*
User user = new User.Builder()
        .name("Prashant")
        .age(25)
        .country("India")
        .build();
 */
public class User {

    private String name;
    private int age;
    private String country;

    private User() {}

    public static class Builder {

        private User user = new User();

        public Builder name(String name) {
            user.name = name;
            return this;
        }

        public Builder age(int age) {
            user.age = age;
            return this;
        }

        public Builder country(String country) {
            user.country = country;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
