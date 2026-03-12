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
 Maven Dependency::::::::::::::::;
<dependency>
    <groupId>org.mongodb</groupId>
    <artifactId>mongodb-driver-sync</artifactId>
    <version>4.11.1</version>
</dependency>


Application
   │
   ├ UserService
   ├ OrderService
   └ PaymentService
        │
        ▼
MongoConnectionManager (Singleton)
        │
   MongoClient (Connection Pool)
        │
      MongoDB
--------------------------------------------------------------------
 */

public class MongoConnectionManager {
    private static MongoConnectionManager instance;

    private MongoClient mongoClient;

    private static final String CONNECTION_STRING =
            "mongodb://localhost:27017";

    private static final String DATABASE_NAME =
            "testdb";

    private MongoConnectionManager() {

        mongoClient = MongoClients.create(CONNECTION_STRING);

        System.out.println("MongoDB Client Initialized");
    }


}
