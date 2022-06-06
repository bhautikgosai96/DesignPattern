package SingletonDesignPattern;

public class SingletonThreadMain {

    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");

        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            Singleton s1 = Singleton.getInstance(1);
            System.out.println(s1.val);
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            Singleton s1 = Singleton.getInstance(2);
            System.out.println(s1.val);
        }
    }
}
