package gslc.bangun;
import java.util.Scanner;

public class MainClass {
    int opt;
    Scanner s;
    MenuBangun mb;


    public MainClass(){
        s = new Scanner(System.in);
        mb = new MenuBangun();
    }

    public void mainMenu() {
        do {
            System.out.println("=======================================");
            System.out.println("Program Penghitung Bangun Datar & Ruang");
            System.out.println("=======================================");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("3. Exit");
            System.out.print("Masukan pilihan: ");
            opt = s.nextInt();
            System.out.println();
            switch (opt) {
                case 1 -> mb.menuBangunDatar();
                case 2 -> mb.menuBangunRuang();
            }
        }while (opt != 3);
    }

    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.mainMenu();
    }
}
