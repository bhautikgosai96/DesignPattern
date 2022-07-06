package ChainOfResponsibilityDesignPattern;

public class Calculator {

    public Calculator(Number number) {
        ChainOperation addOperation = new AddOperation();
        ChainOperation subOperation = new SubOperation();
        ChainOperation multiOperation = new MultiOperation();
        ChainOperation divOperation = new DivOperation();

        addOperation.setNextChainOperation(subOperation);
        subOperation.setNextChainOperation(multiOperation);
        multiOperation.setNextChainOperation(divOperation);

        addOperation.calculate(number);
    }


}
