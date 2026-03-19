package creational_patterns.prototype.cloneable_prototype;

/*
4️⃣ Cloneable Prototype

Java provides the Cloneable interface.

Usage

Document d1 = new Document("Original");

Document d2 = d1.clone();
 */
public class Document implements Cloneable {

    String content;

    public Document(String content){
        this.content = content;
    }

    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }
}
