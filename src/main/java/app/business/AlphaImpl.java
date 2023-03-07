package app.business;

import app.api.Api;
import app.business.security.Filtering;
import app.entity.AppAlphaCustomer;
import client.alphabank.AlphaCustomer;
import client.alphabank.secutiry.AlphaLoginDetails;

import java.util.List;

public class AlphaImpl implements Api {

    public boolean loginUser(AlphaLoginDetails alphaLoginDetails){
        return new Filtering().validate(alphaLoginDetails);
    }

    @Override
    public AlphaCustomer createCustomer(AlphaCustomer alphaCustomer) {

        Mapper<AlphaCustomer> mapper = new Mapper();
        AppAlphaCustomer appAlphaCustomer = null;

        try
        {
            appAlphaCustomer = (AppAlphaCustomer) mapper.map(alphaCustomer);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

//        AlphaCustomerToAppAlphaCustomerMapper mapper = new AlphaCustomerToAppAlphaCustomerMapper();
//        AppAlphaCustomer appAlphaCustomer = mapper.map(alphaCustomer);

        // Could be added to constructor
        AppAlphaCustomer.setCount(AppAlphaCustomer.getCount() + 1);
        appAlphaCustomer.setId(AppAlphaCustomer.getCount());

        addLogic(appAlphaCustomer);




        return null;
    }

    private static void addLogic(AppAlphaCustomer appAlphaCustomer) {
        if (appAlphaCustomer.getYpoloipo()>0) {
            appAlphaCustomer.setKatastasi("ALPHA_GREEN");
            appAlphaCustomer.setBonus(appAlphaCustomer.getYpoloipo()*0.2);
        } else {
            appAlphaCustomer.setKatastasi("ALPHA_RED");
        }
    }

    @Override
    public AlphaCustomer updateCustomer(AlphaCustomer alphaCustomer) {
        return null;
    }

    @Override
    public void deleteCustomer(AlphaCustomer alphaCustomer) {

    }

    @Override
    public List<AlphaCustomer> getCustomers() {
        return null;
    }
}
