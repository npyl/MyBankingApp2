package client;

import app.controller.RESTController;
import client.alphabank.AlphaCustomer;
import client.alphabank.secutiry.AlphaLoginDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = RESTController.class)
public class ClientApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        AlphaCustomer pathan = new AlphaCustomer("Pan", "Athan", 2000);
        AlphaCustomer lpanag = new AlphaCustomer("Leon", "Panag", 1000);
        AlphaCustomer npyl = new AlphaCustomer("Nick", "Pyl", -3000);
        AlphaCustomer aalex = new AlphaCustomer("Ang", "Alex", 4000);
        AlphaCustomer tzar = new AlphaCustomer("Taxi", "Zar", -5000);
        AlphaCustomer alek = new AlphaCustomer("Alex", "Lek", 250);

        AlphaLoginDetails credentials = new AlphaLoginDetails("Alphauser", "Alphapass");

        SpringApplication.run(ClientApplication.class, args);
    }

}
