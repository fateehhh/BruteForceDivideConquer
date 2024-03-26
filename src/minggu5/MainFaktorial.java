package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc17.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("msukkan nilai data ke-" + (i + 1) + ": ");
            int iNilai = sc17.nextInt();
            fk[i].nilai = iNilai; // tidak ada di dalam instruksi jobsheet
        }

        System.out.println("======================================");
        System.out.println("Mau menghitung dengan metode apa?");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide And Conquer");
        System.out.println("======================================");
        System.out.print("Pilihan: ");
        int pilihan = sc17.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("HASIL - BRUTE FORCE");
                for (int i = 0; i < iJml; i++) {
                    System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah "
                            + fk[i].faktorialBF(fk[i].nilai));
                }
                break;
            case 2:
                System.out.println("HASIL - DIVIDE AND CONQUER");
                for (int i = 0; i < iJml; i++) {
                    System.out.println("Hasil perhitungan faktorial menggunakan DIvide and Conquer adalah "
                            + fk[i].faktorialDC(fk[i].nilai));
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                main(args);
        }
    }
}
