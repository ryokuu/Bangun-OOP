package gslc.bangun;

abstract class BangunDatar{
    protected double panjang;
    protected double lebar;
    protected double luas;
    protected double keliling;
    protected final double phi = 3.14;

    /*abstract method kosong yang akan dioverride
    oleh child class */

    public abstract void inputUkuran();
    public abstract void hitungLuas();
    public abstract void hitungKeliling();


    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}

