package app.business.security;

import app.service.AlphaServiceImpl;
import client.alphabank.secutiry.AlphaLoginDetails;

import java.util.HashMap;
import java.util.List;

public class Filtering {

    public boolean validate(AlphaLoginDetails alphaLoginDetails){

        final List<HashMap<String, String>> hashMaps = new AlphaServiceImpl().fetchCreds();

        for (HashMap<String,String> creds : hashMaps){
            if (creds.get(alphaLoginDetails).equals(alphaLoginDetails.getPassword())){
                return true;
            }
        }
        return false;
    }

}
