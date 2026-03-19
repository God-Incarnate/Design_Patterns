package creational_patterns.prototype.serialization_prototype;

import java.io.*;

/*
5️⃣ Serialization Prototype

Deep cloning using serialization.

Works even for complex object graphs.

Usage

User clone = (User) SerializationClone.deepClone(user);

Advantage:

Full deep copy automatically
 */
public class SerializationClone {

    public static Object deepClone(Object object)
            throws Exception {

        ByteArrayOutputStream bos =
                new ByteArrayOutputStream();

        ObjectOutputStream out =
                new ObjectOutputStream(bos);

        out.writeObject(object);

        ByteArrayInputStream bis =
                new ByteArrayInputStream(bos.toByteArray());

        ObjectInputStream in =
                new ObjectInputStream(bis);

        return in.readObject();
    }
}
