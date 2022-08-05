package StateDesignPattern;

public class FailedStatus implements Status {
    @Override
    public void createTransaction() throws Exception {
        System.out.println("Can not create with failed status");
    }

    @Override
    public void updateTransaction() {
        //update transaction
        System.out.println("Transaction updated");
        this.updateBalanceAndCreateStatement();
    }

    @Override
    public void updateBalanceAndCreateStatement() {
        //update balance and create statement
        System.out.println("account updated & statement created");
    }

    @Override
    public void amendTransaction() throws Exception {
        System.out.println("Can not amend transaction");
    }
}
