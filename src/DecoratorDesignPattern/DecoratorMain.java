package DecoratorDesignPattern;

public class DecoratorMain {

    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.preparePizza());
        System.out.println(basicPizza.price());

        Pizza cheesePizza = new CheesePizza(new BasicPizza());
        System.out.println(cheesePizza.preparePizza());
        System.out.println(cheesePizza.price());

        Pizza cornCheesePizza = new CornPizza(new CheesePizza(new BasicPizza()));
        System.out.println(cornCheesePizza.preparePizza());
        System.out.println(cornCheesePizza.price());
    }
}
