package ChainOfResponsibilityDesignPattern;

public class Number {

    private Integer number1;
    private Integer number2;
    private String operation;

    public Number(Integer newNumber1, Integer newNumber2, String newOperation){
        number1 = newNumber1;
        number2 = newNumber2;
        operation = newOperation;
    }

    public Integer getNumber1(){
        return number1;
    }
    public Integer getNumber2(){
        return number2;
    }
    public String getOperation(){
        return operation;
    }
}
