package creational_patterns.prototype.copy_constructor_prototype;

/*
6️⃣ Copy Constructor Prototype

Instead of clone(), we use a constructor that copies fields.

Usage::::::::::::::::::::::::::::::::

User u1 = new User("Prashant",25);

User u2 = new User(u1);

This is considered better than clone() in modern Java.
 */
class User {

    String name;
    int age;

    public User(User other){

        this.name = other.name;
        this.age = other.age;
    }
}
