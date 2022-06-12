package AdapterDesignPattern;

public class AdapterMain {

    public static void main(String[] args) {
        Pen pilotPen = new PilotPenAdapter();
        Pen gelPen = new GelPenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(pilotPen);
        aw.writeAssignment("I am need to complete design pattern!!!!!");

        aw.setPen(gelPen);
        aw.writeAssignment("I am need to complete design pattern!!!!!");
    }
}
