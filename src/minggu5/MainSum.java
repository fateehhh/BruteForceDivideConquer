package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlPerusahaan = sc17.nextInt();
        Sum[] sm = new Sum[jmlPerusahaan];

        for (int i = 0; i < sm.length; i++) {
            System.out.println();
            System.out.println("============================================================");
            System.out.println("Perusahaan ke -"+(i + 1));
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc17.nextInt();
            sm[i] = new Sum(elm);
            for (int j = 0; j < elm; j++) {
                System.out.println("============================================================");
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " = ");
                sm[i].keuntungan[j] = sc17.nextDouble();
                
            }
        }
        for (int i = 0; i < sm.length; i++) {
            System.out.println();
            System.out.println("Total Keuntungan Perusahaan ke-"+(i+1));
            int j = sm[i].keuntungan.length;
            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = "
                    + sm[i].totalBF(sm[i].keuntungan));
                    System.out.println("============================================================");
                    System.out.println("Algoritma Divide And Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = "
                    + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        }
        double totPerusahaan = 0;

        for (int i = 0; i < sm.length; i++) {
            totPerusahaan += sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1);
        }
        System.out.println("============================================================");
        System.out.println("Total keuntungan semua perusahaan: "+ totPerusahaan);
    }
}