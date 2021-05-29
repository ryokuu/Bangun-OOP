package gslc.bangun;
import java.util.Scanner;

public class Persegi extends BangunDatar {
    Scanner s;

    public Persegi(){
        super();
        s = new Scanner(System.in);
    }

    @Override
    public void inputUkuran() {
        do {// untuk checking input
            System.out.println("Persegi Panjang");
            System.out.println("---------------");
            System.out.print("Masukan Panjang: ");
            panjang = s.nextDouble();
            System.out.print("Masukan Lebar: ");
            lebar = s.nextDouble();
        }while (panjang<=0 && lebar<=0 && s.hasNextDouble());
        setPanjang(panjang);
        setLebar(lebar);
    }

    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
        System.out.print("Luas Persegi: "+ luas +" cm2\n");
    }

    @Override
    public void hitungKeliling() {
        keliling = 2*(panjang+lebar);
        System.out.print("Keliling Persegi: "+ keliling +" cm\n\n");
    }
}
