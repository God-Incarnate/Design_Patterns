package creational_patterns.singleton_pattern;


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
