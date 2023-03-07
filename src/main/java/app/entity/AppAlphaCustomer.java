package app.entity;

import client.alphabank.ALPHA_STATUS;

public class AppAlphaCustomer extends AppCustomer {

    private String katastasi;
    private double bonus;



    // Belongs to the class
    private static int count;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getOnoma() {
        return onoma;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public double getYpoloipo() {
        return ypoloipo;
    }

    public String getKatastasi() {
        return katastasi;
    }

    public double getBonus() {
        return bonus;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        AppAlphaCustomer.count = count;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public void setYpoloipo(double ypoloipo) {
        this.ypoloipo = ypoloipo;
    }

    public void setKatastasi(String katastasi) {
        this.katastasi = katastasi;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
