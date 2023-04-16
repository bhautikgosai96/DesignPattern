package DecoratorDesignPattern;

public class BasicPizza implements Pizza {

    @Override
    public String preparePizza() {
        return "Basic Pizza preparing";
    }

    @Override
    public Integer price() {
        return 100;
    }
}
