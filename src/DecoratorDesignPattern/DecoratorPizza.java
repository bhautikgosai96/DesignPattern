package DecoratorDesignPattern;

public class DecoratorPizza implements Pizza {

    private Pizza pizza;

    DecoratorPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String preparePizza() {
        return this.pizza.preparePizza();
    }

    @Override
    public Integer price() {
        return this.pizza.price();
    }
}
