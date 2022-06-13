package BridgeDesignPattern;

public class Radio implements Device{

    private Boolean on = false;
    private Integer volume = 2;
    private Integer channel = 100;

    @Override
    public Boolean isEnabled() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public Integer getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(Integer volume) {
        if (this.volume > 100) {
            this.volume = 100;
        } else if (this.volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public Integer getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    @Override
    public void status() {
        System.out.println("This is Radio and it is " + (this.on ? "on" : "off"));
        System.out.println("volume is " + this.volume);
        System.out.println("channel is " + this.channel);
    }
}
