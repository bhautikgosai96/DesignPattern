package FactoryDesignPattern;

public class FactoryMain {

    public static void main(String[] args) {
        CandleFactory candleFactory = new CandleFactory();
        Candle candle = candleFactory.getCandle("Five");
        candle.timeFrame();
    }
}
