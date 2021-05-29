package gslc.bangun;
import java.util.Scanner;

public class Segitiga extends BangunDatar{
    Scanner s;
    protected double alas;
    protected double tinggi;
    protected double sisi2;
    protected double sisi3;

    public Segitiga(){
        super();
        s = new Scanner(System.in);
    }

    @Override
    public void inputUkuran() {
        do {// untuk checking input
            System.out.println("Segitiga");
            System.out.println("--------");
            System.out.print("Masukan Alas: ");
            alas = s.nextDouble();
            System.out.print("Masukan Tinggi: ");
            tinggi = s.nextDouble();
            // untuk menghitung keliling
            System.out.print("Masukan Panjang Sisi ke-2: ");
            sisi2 = s.nextDouble();
            System.out.print("Masukan Panjang Sisi ke-3: ");
            sisi2 = s.nextDouble();
        }while (alas<=0 && tinggi <= 0 && s.hasNextDouble());
    }

    @Override
    public void hitungLuas() {
        luas = alas * tinggi * 2;
        System.out.print("Luas Segitiga: "+ luas +" cm2\n");
    }

    @Override
    public void hitungKeliling() {
        keliling = alas + sisi2 +sisi3;
        System.out.println("Keliling Segitiga: "+keliling + " cm\n\n");
    }
}
