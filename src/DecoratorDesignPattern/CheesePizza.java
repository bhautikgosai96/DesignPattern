package DecoratorDesignPattern;

public class CheesePizza extends DecoratorPizza {

    CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String preparePizza() {
        return super.preparePizza() + " with cheese";
    }

    @Override
    public Integer price() {
        return super.price() + 40;
    }
}
