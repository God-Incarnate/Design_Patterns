package creational_patterns.prototype.deep_copy_prototype;

/*
2️⃣ Deep Copy Prototype

In deep copy, the entire object graph is cloned.

Now changes in clone do not affect original object.
 */
class User implements Cloneable {

    String name;
    Address address;

    User(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public User clone(){

        Address clonedAddress = address.clone();

        return new User(name, clonedAddress);
    }
}
