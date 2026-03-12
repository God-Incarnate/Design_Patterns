package creational_patterns.singleton_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

/*
-----------------------SQL----------------------------------
Usage::::::::
        public class UserService {

            public void fetchUsers() {

                DatabaseConnectionPool pool =
                        DatabaseConnectionPool.getInstance();

                Connection connection = pool.getConnection();

                System.out.println("Using connection: " + connection);

                pool.releaseConnection(connection);
            }
        }



Application Services
   │
   │ request connection
   ▼
DatabaseConnectionPool (Singleton)
   │
   ├ Connection 1
   ├ Connection 2
   ├ Connection 3
   └ Connection n

---------------------------------------------------------------------------------


All services borrow and return connections.

 */

public class DatabaseConnectionPool {
    private DatabaseConnectionPool instance;
    private static final int POOL_SIZE=4;
    private Queue<Connection> connectionPool= new LinkedList<>();
    private static Logger logger=Logger.getInstance();

    private DatabaseConnectionPool(){
        try{
            for (int i=0;i<POOL_SIZE;i++){
                Connection connection= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/testdb",
                        "root",
                        "password");
                connectionPool.add(connection);
            }

            logger.info("Connection pool initialised");

        } catch (SQLException e) {
            throw new RuntimeException("Error creating connections "+e);
        }
    }

    public synchronized DatabaseConnectionPool getInstance(){
        if(instance==null){
            return new DatabaseConnectionPool();
        }
        return instance;
    }

    public synchronized Connection getConnection(){
        if (connectionPool.isEmpty()) {
            throw new RuntimeException("No available connection");
        }
        return connectionPool.poll();
    }

    public synchronized void releaseConnection(Connection connection){
        connectionPool.offer(connection);
    }
}
