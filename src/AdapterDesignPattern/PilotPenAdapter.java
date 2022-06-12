package AdapterDesignPattern;

public class PilotPenAdapter implements Pen{

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
