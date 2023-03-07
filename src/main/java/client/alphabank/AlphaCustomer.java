package client.alphabank;

import client.Customer;

public class AlphaCustomer extends Customer {

    private ALPHA_STATUS status;
    private double bonus;

    public AlphaCustomer(String name, String surname, double balance) {
        super(name, surname, balance);
    }
}
