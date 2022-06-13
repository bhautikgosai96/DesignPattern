package BridgeDesignPattern;


public class AdvanceRemote extends BasicRemote{
    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote is on mute");
        device.setVolume(0);
    }
}
