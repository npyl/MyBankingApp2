package client.winbank;

import client.Customer;

public class WinCustomer extends Customer {
    private WINBANK_STATUS status;
    private double yellows;

    public WinCustomer(String name, String surname, double balance) {
        super(name, surname, balance);
    }
}
