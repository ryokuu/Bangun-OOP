package gslc.bangun;
import java.util.Scanner;

public class Tabung extends BangunRuang{
    Scanner s;
    protected double jari2;
    protected final double phi = 3.14;
    public Tabung(){
        super();
        s = new Scanner(System.in);
    }

    @Override
    public void inputUkuran() {
        do {// untuk checking input
            System.out.println("Tabung");
            System.out.println("------");
            System.out.print("Masukan Jari-Jari: ");
            jari2 = s.nextDouble();
            System.out.print("Masukan Tinggi: ");
            tinggi = s.nextDouble();
        }while (tinggi <=0 && jari2<=0 && s.hasNextDouble());
    }

    @Override
    public void hitungVolume() {
        volume = phi* (jari2*jari2) * tinggi;
        System.out.print("Volume Tabung: "+ volume +" cm3\n");
    }

    @Override
    public void hitungLuasPermukaan() {
        luaspermukaan = (2*phi*jari2*tinggi) + (2*phi*(jari2*jari2));
        System.out.print("Luas Permukaan Tabung: "+ luaspermukaan +" cm2\n\n");
    }
}
