package app.business;

import app.entity.AppAlphaCustomer;
import app.entity.AppWinCustomer;
import app.entity.AppCustomer;
import client.Customer;
import client.alphabank.AlphaCustomer;
import client.winbank.WinCustomer;

public class Mapper<T extends Customer> {

    // takes *Customer and converts to *AppCustomer
    public AppCustomer map(T c) throws Exception {

        AppCustomer ac = null;

        if (c instanceof AlphaCustomer)
        {
            ac = new AppAlphaCustomer();
            ac.setOnoma(c.getName());
            ac.setEpitheto(c.getSurname());
            ac.setYpoloipo(c.getBalance());

            // TODO:
//            cc.setKatastasi(c.getStatus().toString());
//            cc.setBonus(c.getBonus());
        }
        else if (c instanceof WinCustomer)
        {
            ac = new AppWinCustomer();

            ac.setOnoma(c.getName());
            ac.setEpitheto(c.getSurname());
            ac.setYpoloipo(c.getBalance());

            // TODO:
//            cc.setKatastasi(c.getStatus().toString());
//            cc.setBonus(c.getBonus());

        }

        return ac;
    }
}
