package StateDesignPattern;

import java.util.List;

public class StatusFactory {

    public Status getStatusInstance(String status) throws Exception {
        if ("PENDING".equals(status)) {
            return new PendingStatus();
        } else if ("SUCCESS".equals(status)) {
            return new SuccessStatus();
        } else if ("FAILED".equals(status)) {
            return new FailedStatus();
        } else {
            throw new Exception("invalid status");
        }
    }
}
