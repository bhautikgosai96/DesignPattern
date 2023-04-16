package DecoratorDesignPattern;

public class PaneerPizza extends DecoratorPizza {
    PaneerPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String preparePizza() {
        return super.preparePizza() + " with Paneer";
    }

    @Override
    public Integer price() {
        return super.price() + 30;
    }
}
