package SingletonDesignPattern;

public class SingletonMain {

    /**
     * Singleton is a creational design pattern, which ensures that only one object of its kind exists
     * and provides a single point of access to it for any other code.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");

        Singleton s1 = Singleton.getInstance(1);
        Singleton s2 = Singleton.getInstance(2);
        System.out.println("s1 -> "+s1.val);
        System.out.println("s2 -> "+s2.val);


    }
}
