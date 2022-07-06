package ChainOfResponsibilityDesignPattern;

public class MultiOperation implements ChainOperation {
    private ChainOperation nextChainOperation;
    @Override
    public void setNextChainOperation(ChainOperation chainOperation) {
        this.nextChainOperation = chainOperation;
    }

    @Override
    public void calculate(Number number) {
        if (number.getOperation().equals("MULTI")) {
            System.out.println(number.getNumber1()+" * "+ number.getNumber2()+" = "+(number.getNumber1() * number.getNumber2()));
        } else {
            nextChainOperation.calculate(number);
        }
    }
}
