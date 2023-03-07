package app.business;

import app.entity.AppAlphaCustomer;
import client.alphabank.AlphaCustomer;

public class AlphaCustomerToAppAlphaCustomerMapper {

    public AppAlphaCustomer map(AlphaCustomer alphaCustomer){

        AppAlphaCustomer appAlphaCustomer = new AppAlphaCustomer();
        appAlphaCustomer.setOnoma(alphaCustomer.getName());
        appAlphaCustomer.setEpitheto(alphaCustomer.getSurname());
        appAlphaCustomer.setYpoloipo(alphaCustomer.getBalance());
        appAlphaCustomer.setKatastasi(alphaCustomer.getStatus().toString());
        appAlphaCustomer.setBonus(alphaCustomer.getBonus());

        return appAlphaCustomer;
    }


}
