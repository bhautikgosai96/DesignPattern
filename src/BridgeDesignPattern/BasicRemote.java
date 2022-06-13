package BridgeDesignPattern;

public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote() {

    }

    public BasicRemote(Device device) {
        this.device = device;
    }
    @Override
    public void power() {
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    @Override
    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 2);
    }

    @Override
    public void volumeDown() {
        this.device.setVolume(this.device.getVolume() - 2);
    }

    @Override
    public void channelUp() {
        this.device.setChannel(this.device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        this.device.setChannel(this.device.getChannel() - 1);
    }
}
