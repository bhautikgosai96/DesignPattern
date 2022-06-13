package BridgeDesignPattern;

public class BridgeMain {

    public static void main(String[] args) {
        test(new Tv());
        test(new Radio());
    }

    public static void test(Device device) {
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.status();

        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        advanceRemote.power();
        advanceRemote.mute();
        device.status();

        System.out.println("---------------------------");
    }
}
