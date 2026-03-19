package creational_patterns.prototype.shallow_copy_prototype;

/*
1️⃣ Shallow Copy Prototype

In shallow copy, only the top-level object is cloned, but nested objects are shared.

Usage::::::::::::::::::::::::
Address addr = new Address("Delhi");

User u1 = new User("Prashant", addr);
User u2 = u1.clone();

u2.address.city = "Mumbai";

Result::::::::::::::::::::::

u1.address.city = Mumbai
u2.address.city = Mumbai

Because address object is shared.
 */
class User implements Cloneable {

    String name;
    Address address;

    User(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public User clone() throws CloneNotSupportedException {
        return (User) super.clone(); // shallow copy
    }
}
