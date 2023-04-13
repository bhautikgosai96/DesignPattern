package MediatorDesignPattern;

public class Flight implements Command {
    private IATCMediator mediator;

    Flight(IATCMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        if (this.mediator.isAvailable()) {
            System.out.println("Successfully landed");
            this.mediator.setAvailability(false);
        } else {
            System.out.println("waiting for runway");
        }
    }

    public void readyToLand() {
        System.out.println("Landing initiated");
    }

    public void parked() {
        System.out.println("Flight parked");
        this.mediator.setAvailability(true);
    }
}
