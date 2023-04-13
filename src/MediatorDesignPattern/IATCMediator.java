package MediatorDesignPattern;

public interface IATCMediator {

    public void registerRunway(Runway runway);
    public void registerFlight(Flight flight);
    public boolean isAvailable();
    public void setAvailability(boolean status);
}
