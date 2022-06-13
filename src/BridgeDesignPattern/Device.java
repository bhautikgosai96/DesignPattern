package BridgeDesignPattern;

public interface Device {

    Boolean isEnabled();

    void enable();

    void disable();

    Integer getVolume();

    void setVolume(Integer volume);

    Integer getChannel();

    void setChannel(Integer channel);

    void status();
}
