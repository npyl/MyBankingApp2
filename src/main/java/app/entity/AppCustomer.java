package app.entity;

public class AppCustomer {
    protected double id;
    protected String onoma;
    protected String epitheto;
    protected double ypoloipo;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public double getYpoloipo() {
        return ypoloipo;
    }

    public void setYpoloipo(double ypoloipo) {
        this.ypoloipo = ypoloipo;
    }
}
