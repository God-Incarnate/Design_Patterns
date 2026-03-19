package creational_patterns.builder_patterns.immutable_object_builder;

/*
3️⃣ Immutable Object Builder

Used when the object must never change after creation.

Very common in enterprise systems.

Advantages:

Thread safe
Immutable
Cleaner design
 */
public class User {

    private final String name;
    private final int age;
    private final String country;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.country = builder.country;
    }

    public static class Builder {

        private String name;
        private int age;
        private String country;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
