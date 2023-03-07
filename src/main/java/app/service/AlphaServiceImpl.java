package app.service;

import app.entity.AppAlphaCustomer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlphaServiceImpl implements AlphaService{

    @Override
    public AppAlphaCustomer save(AppAlphaCustomer alphaCustomer) {
        return null;
    }

    @Override
    public List<HashMap<String, String>> fetchCreds(){

        System.out.println("I found the following credentials in the db");

        HashMap<String, String> creds1 = new HashMap<>();
        creds1.put("alphauser1", "alphapass1");
        HashMap<String, String> creds2 = new HashMap<>();
        creds2.put("alphauser2", "alphapass2");
        HashMap<String, String> creds3 = new HashMap<>();
        creds3.put("alphauser3", "alphapass3");

        List<HashMap<String, String>> credentialsList = new ArrayList<>();

        credentialsList.add(creds1);
        credentialsList.add(creds2);
        credentialsList.add(creds3);

        return credentialsList;
    }
}
