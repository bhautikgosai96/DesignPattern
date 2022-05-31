package FactoryDesignPattern;

public class DailyCandle implements Candle{
    @Override
    public void timeFrame() {
        System.out.println("Daily Candle.......");
    }
}
