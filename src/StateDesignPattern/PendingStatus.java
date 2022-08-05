package StateDesignPattern;

public class PendingStatus implements Status {
    @Override
    public void createTransaction() {
        //create transaction
        System.out.println("Transaction created");
        this.updateBalanceAndCreateStatement();
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
    public void amendTransaction() {
        System.out.println("amend successful");
    }
}
