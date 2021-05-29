package gslc.bangun;

abstract class BangunRuang{
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected double volume;
    protected double luaspermukaan;

    public abstract void inputUkuran();
    public abstract void hitungVolume();
    public abstract void hitungLuasPermukaan();


    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
