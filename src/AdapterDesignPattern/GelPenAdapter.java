package AdapterDesignPattern;

public class GelPenAdapter implements Pen{

    GelPen gp = new GelPen();
    @Override
    public void write(String str) {
        gp.writeWithGelPen(str);
    }
}
