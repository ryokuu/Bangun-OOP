package gslc.bangun;
import java.util.Scanner;

/* class ini digunakan untuk memanggil childclass
* dari bangun datar dan bangun ruang karena
* abstract class tidak dapat diinisialisasi sebagai object*/
public class MenuBangun {
    Scanner s;
    int opt;
    Persegi pr;
    Lingkaran lr;
    Segitiga sg;
    Balok bl;
    Tabung tb;

    public MenuBangun(){
    s = new Scanner(System.in);
    pr = new Persegi();
    lr = new Lingkaran();
    sg = new Segitiga();
    bl = new Balok();
    tb = new Tabung();
    }

    public void menuBangunDatar(){
        System.out.println("Bangung Datar");
        System.out.println("=============");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.print("Masukan bangun yang ingin di hitung: ");
        opt = s.nextInt();
        System.out.println();
        switch (opt){
            case 1:
                pr.inputUkuran();
                pr.hitungLuas();
                pr.hitungKeliling();
                break;
            case 2:
                lr.inputUkuran();
                lr.hitungLuas();
                lr.hitungKeliling();
            case 3:
                sg.inputUkuran();
                sg.hitungLuas();
                sg.hitungKeliling();
        }
    }

    public void menuBangunRuang(){
        System.out.println("Bangung Ruang");
        System.out.println("=============");
        System.out.println("1. Balok");
        System.out.println("2. Tabung");
        System.out.print("Masukan bangun yang ingin di hitung: ");
        opt = s.nextInt();
        System.out.println();
        switch (opt){
            case 1:
                bl.inputUkuran();
                bl.hitungVolume();
                bl.hitungLuasPermukaan();
                break;
            case 2:
                tb.inputUkuran();
                tb.hitungVolume();
                tb.hitungLuasPermukaan();
                break;
        }
    }
}
