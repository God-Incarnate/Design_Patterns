package creational_patterns.builder_patterns.lombok_builder;

import lombok.Builder;
import lombok.Data;

/*
Usage:::::::::::::::::::::
User user = User.builder()
        .name("Prashant")
        .age(25)
        .country("India")
        .build();
 */
@Data
@Builder
public class User {

    private String name;
    private int age;
    private String country;
}
