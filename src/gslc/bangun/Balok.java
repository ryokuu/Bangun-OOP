package gslc.bangun;
import java.util.Scanner;

public class Balok extends BangunRuang{
    Scanner s;

    public Balok(){
        super();
        s = new Scanner(System.in);
    }

    @Override
    public void inputUkuran() {
        do {// untuk checking input
            System.out.println("Balok");
            System.out.println("-----");
            System.out.print("Masukan Panjang: ");
            panjang = s.nextDouble();
            System.out.print("Masukan Lebar: ");
            lebar = s.nextDouble();
            System.out.print("Masukan Tinggi: ");
            tinggi = s.nextDouble();
        }while (panjang<=0 && lebar<=0 && tinggi<=0 && s.hasNextDouble());
        setPanjang(panjang);
        setLebar(lebar);
        setTinggi(tinggi);
    }

    @Override
    public void hitungVolume() {
        volume = panjang * lebar * tinggi;
        System.out.print("Volume Balok: "+ volume +" cm3\n");
    }

    @Override
    public void hitungLuasPermukaan() {
        luaspermukaan = 2*(panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.print("Luas Permukaan Balok: "+ luaspermukaan +" cm2\n\n");
    }
}
