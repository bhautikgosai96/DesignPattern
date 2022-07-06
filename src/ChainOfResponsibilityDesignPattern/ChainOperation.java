package ChainOfResponsibilityDesignPattern;

public interface ChainOperation {

    void setNextChainOperation(ChainOperation chainOperation);

    void  calculate(Number number);
}
