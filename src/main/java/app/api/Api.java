package app.api;

import client.alphabank.AlphaCustomer;
import client.alphabank.secutiry.AlphaLoginDetails;

import java.util.List;

public interface Api {

    //remote || local

    boolean loginUser(AlphaLoginDetails alphaLoginDetails);

    AlphaCustomer createCustomer(AlphaCustomer alphaCustomer);
    AlphaCustomer updateCustomer(AlphaCustomer alphaCustomer);
    void deleteCustomer(AlphaCustomer alphaCustomer);
    List<AlphaCustomer> getCustomers();
}
