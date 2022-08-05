package StateDesignPattern.models;

public class CreateRequest {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
    private Double balance;
}
