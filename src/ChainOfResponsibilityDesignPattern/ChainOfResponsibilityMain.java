package ChainOfResponsibilityDesignPattern;

public class ChainOfResponsibilityMain {

    public static void main(String[] args){
        Number number = new Number(4, 2, "MULTI");
        Calculator calculator = new Calculator(number);
    }
}
