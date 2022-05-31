package FactoryDesignPattern;

public class CandleFactory {

    public Candle getCandle(String timeFrame) {
        if ("Daily".equals(timeFrame)) {
            return new DailyCandle();
        } else {
            return new FiveMinuteCandle();
        }
    }
}
