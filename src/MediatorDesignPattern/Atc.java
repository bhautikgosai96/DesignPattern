package MediatorDesignPattern;

public class Atc implements IATCMediator {

    private Runway runway;
    private Flight flight;
    private boolean available;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailability(boolean status) {
        this.available = status;
    }
}
