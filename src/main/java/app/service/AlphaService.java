package app.service;

import app.entity.AppAlphaCustomer;

import java.util.HashMap;
import java.util.List;

public interface AlphaService {

    List<HashMap<String, String>> fetchCreds();
    AppAlphaCustomer save(AppAlphaCustomer alphaCustomer);



}
