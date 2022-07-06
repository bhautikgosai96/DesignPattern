package ChainOfResponsibilityDesignPattern;

public class DivOperation implements ChainOperation{
    private ChainOperation nextChainOperation;
    @Override
    public void setNextChainOperation(ChainOperation chainOperation) {
        this.nextChainOperation = chainOperation;
    }

    @Override
    public void calculate(Number number) {
        if (number.getOperation().equals("DIV")) {
            System.out.println(number.getNumber1()+" / "+ number.getNumber2()+" = "+(number.getNumber1() / number.getNumber2()));
        } else {
            System.out.println("Only ADD, SUB, MULTI & DIV operations are allowed.....");
        }
    }
}
