package minggu5;

import java.util.Scanner;

public class MainPengkat {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc17.nextInt();

        Pangkat [] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc17.nextInt();
            png[i].nilai = nilai;
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc17.nextInt();
            png[i].pangkat = pangkat;
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println
            ("Hasil dari " + png[i].nilai + " pangkat "
            + png[i].pangkat + " adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println
            ("Hasil dari " + png[i].nilai + " pangkat "
            + png[i].pangkat + " adalah "
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
