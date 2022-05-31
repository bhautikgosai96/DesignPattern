package FactoryDesignPattern;

public class FiveMinuteCandle implements Candle {
    @Override
    public void timeFrame() {
        System.out.println("Five Minute Candle.......");
    }
}
