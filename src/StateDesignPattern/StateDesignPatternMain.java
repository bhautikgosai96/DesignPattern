package StateDesignPattern;

import StateDesignPattern.models.CreateRequest;
import StateDesignPattern.models.UpdateRequest;

public class StateDesignPatternMain {

    public static void main(String[] args) throws Exception {
        StatusFactory statusFactory = new StatusFactory();

        CreateRequest request = new CreateRequest();
        request.setStatus("PENDING");
        Status statusInstance = statusFactory.getStatusInstance(request.getStatus());
        statusInstance.createTransaction();

        request.setStatus("FAILED");
        statusInstance = statusFactory.getStatusInstance(request.getStatus());
        statusInstance.createTransaction();

        request.setStatus("SUCCESS");
        statusInstance = statusFactory.getStatusInstance(request.getStatus());
        statusInstance.createTransaction();


        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.setStatus("SUCCESS");

        statusInstance = statusFactory.getStatusInstance(updateRequest.getStatus());
        statusInstance.updateTransaction();

        updateRequest.setStatus("FAILED");
        statusInstance = statusFactory.getStatusInstance(request.getStatus());
        statusInstance.updateTransaction();

        updateRequest.setStatus("PENDING");
        statusInstance = statusFactory.getStatusInstance(request.getStatus());
        statusInstance.updateTransaction();
    }
}
