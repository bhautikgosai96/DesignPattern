package StateDesignPattern;

public interface Status {
    void createTransaction() throws Exception;
    void updateTransaction() throws Exception;
    void updateBalanceAndCreateStatement();
    void amendTransaction() throws Exception;
}
