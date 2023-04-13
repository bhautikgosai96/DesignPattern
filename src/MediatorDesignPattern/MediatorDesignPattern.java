package MediatorDesignPattern;

public class MediatorDesignPattern {
    public static void main(String[] args) {
        IATCMediator atc = new Atc();
        Flight f1 = new Flight(atc);
        Flight f2 = new Flight(atc);
        Runway r1 = new Runway(atc);

        f1.readyToLand();
        r1.land();
        f1.land();
        f2.readyToLand();
        f2.land();
        f1.parked();
        f2.land();
    }
}
