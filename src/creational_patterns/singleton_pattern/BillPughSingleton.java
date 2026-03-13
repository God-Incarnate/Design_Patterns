package creational_patterns.singleton_pattern;

/*
2️⃣ Bill Pugh Singleton (Initialization-on-Demand Holder)

This is considered one of the best lazy Singleton implementations in Java.

It uses JVM class loading guarantees.

Key Idea

The Singleton instance is created only when the inner class is loaded.

Java guarantees class initialization is thread-safe.

Advantages

✔ Lazy initialization
✔ Thread-safe
✔ No synchronization overhead
✔ Clean implementation

Used For

Configuration managers

Logging systems

Application context managers
 */

public class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE =
                new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {

        return SingletonHelper.INSTANCE;
    }

    public void printMessage() {
        System.out.println("Bill Pugh Singleton Instance");
    }
}
