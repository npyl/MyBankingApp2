package app.business;

import app.entity.AppAlphaCustomer;
import app.entity.AppWinCustomer;
import app.entity.AppCustomer;
import client.Customer;
import client.alphabank.AlphaCustomer;
import client.winbank.WinCustomer;

public class Mapper<T extends Customer> {

    // takes *Customer and converts to App*Customer
    public AppCustomer map(T c) throws Exception {

        // TODO: somehow fix all these castings??

        AppCustomer ac = null;

        if (c instanceof AlphaCustomer)
        {
            ac = new AppAlphaCustomer();
            ac.setOnoma(c.getName());
            ac.setEpitheto(c.getSurname());
            ac.setYpoloipo(c.getBalance());
            ((AppAlphaCustomer) ac).setKatastasi(((AlphaCustomer) c).getStatus().toString());
            ((AppAlphaCustomer) ac).setBonus(((AlphaCustomer) c).getBonus());
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
//
//public class Mapper<T extends AppCustomer> {
//
//}
