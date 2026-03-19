package creational_patterns.prototype.deep_copy_prototype;

class Address {

    String city;

    Address(String city){
        this.city = city;
    }

    public Address clone(){
        return new Address(this.city);
    }
}
