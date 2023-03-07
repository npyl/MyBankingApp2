package client;

import client.alphabank.AlphaCustomer;
import client.alphabank.secutiry.AlphaLoginDetails;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {

        AlphaCustomer pathan = new AlphaCustomer("Pan", "Athan", 2000);
        AlphaCustomer lpanag = new AlphaCustomer("Leon", "Panag", 1000);
        AlphaCustomer npyl = new AlphaCustomer("Nick", "Pyl", -3000);
        AlphaCustomer aalex = new AlphaCustomer("Ang", "Alex", 4000);
        AlphaCustomer tzar = new AlphaCustomer("Taxi", "Zar", -5000);
        AlphaCustomer alek = new AlphaCustomer("Alex", "Lek", 250);

        AlphaLoginDetails credentials = new AlphaLoginDetails("Alphauser", "Alphapass");

    }

}
