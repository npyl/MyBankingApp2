package app.repo;

import app.entity.AppAlphaCustomer;

import java.util.HashMap;
import java.util.List;

public interface Crud {

    List<HashMap<String, String>> fetchCreds();
    AppAlphaCustomer save(AppAlphaCustomer appAlphaCustomer);

}
