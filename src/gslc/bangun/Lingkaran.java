package gslc.bangun;
import java.util.Scanner;

public class Lingkaran extends BangunDatar{
    Scanner s;
    protected double jari2;

    public Lingkaran(){
        super();
        s = new Scanner(System.in);
    }
    @Override
    public void inputUkuran() {
        do {// untuk checking input
            System.out.println("Lingkaran");
            System.out.println("---------");
            System.out.print("Masukan Jari-Jari: ");
            jari2 = s.nextDouble();
        }while (jari2<=0 && s.hasNextDouble());
    }

    @Override
    public void hitungLuas() {
    luas = phi * (jari2 *jari2);
    System.out.print("Luas Lingkaran: "+ luas +" cm2\n");
    }

    @Override
    public void hitungKeliling() {
    keliling = 2 * phi * jari2;
    System.out.print("Keliling Lingkaran: "+ keliling +" cm\n\n");
    }
}
