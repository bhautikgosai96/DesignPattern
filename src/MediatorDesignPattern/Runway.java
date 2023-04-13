package MediatorDesignPattern;

public class Runway implements Command {
    private IATCMediator mediator;

    Runway(IATCMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        System.out.println("Runway is available for landing");
        this.mediator.setAvailability(true);
    }
}
