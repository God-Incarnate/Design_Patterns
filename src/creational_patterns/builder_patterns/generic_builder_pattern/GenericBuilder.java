package creational_patterns.builder_patterns.generic_builder_pattern;

import java.util.function.Consumer;

/*
Usage:::::::::::::::::::::::
User user = new GenericBuilder<>(new User())
        .with(u -> u.setName("Prashant"))
        .with(u -> u.setAge(25))
        .build();
 */
public class GenericBuilder<T> {

    private final T object;

    public GenericBuilder(T object) {
        this.object = object;
    }

    public GenericBuilder<T> with(Consumer<T> consumer) {
        consumer.accept(object);
        return this;
    }

    public T build() {
        return object;
    }
}
