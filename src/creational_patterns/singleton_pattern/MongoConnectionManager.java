package creational_patterns.singleton_pattern;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/*
-----------------------------------MONGODB---------------------------------------
Usage:::::::::::::::
            import com.mongodb.client.MongoCollection;
            import com.mongodb.client.MongoDatabase;
            import org.bson.Document;

            public class UserService {

                public void insertUser() {

                    MongoDatabase database =
                            MongoConnectionManager
                                    .getInstance()
                                    .getDatabase();

                    MongoCollection<Document> collection =
                            database.getCollection("users");

                    Document user = new Document()
                            .append("name", "Prashant")
                            .append("age", 25);

                    collection.insertOne(user);

                    System.out.println("User inserted");
                }
            }
 */
public class MongoConnectionManager {


}
