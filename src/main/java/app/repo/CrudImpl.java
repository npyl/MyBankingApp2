package app.repo;

import app.entity.AppAlphaCustomer;

import java.util.HashMap;
import java.util.List;

public class CrudImpl implements Crud{
    @Override
    public List<HashMap<String, String>> fetchCreds() {
        System.out.println("I just returned magically the credentials in the service layer!");
        return null;
    }

    @Override
    public AppAlphaCustomer save(AppAlphaCustomer appAlphaCustomer) {

        System.out.println("I checked that object with same id does not exist in the database" +
                "so I saved it!!");

        return appAlphaCustomer;
    }
}
