package SingletonDesignPattern;

public class Singleton {
    private static Singleton singleInstance;
    public Integer val;

    private Singleton(Integer val) {
        this.val = val;
    }

    public static Singleton getInstance(Integer val) {
        synchronized (Singleton.class) {
            if (singleInstance == null) {
                singleInstance = new Singleton(val);
            }
        }
        return singleInstance;
    }

}
