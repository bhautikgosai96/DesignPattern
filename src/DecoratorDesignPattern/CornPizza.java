package DecoratorDesignPattern;

public class CornPizza extends DecoratorPizza{
    CornPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String preparePizza() {
        return super.preparePizza() + " with corn";
    }

    @Override
    public Integer price() {
        return super.price() + 20;
    }
}
