import java.util.Scanner;

public class SearchNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int jumlahElemen = sc.nextInt();

        int[] nilai = new int[jumlahElemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai elemen ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean ditemukan = false;
        int posisiIndeks = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                posisiIndeks = i;
                break;
            }
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("            HASIL PENCARIAN DATA           ");
        System.out.println("-------------------------------------------");
        if (ditemukan) {
            System.out.println("HASIL  : Data BERHASIL ditemukan!");
            System.out.println("NILAI  : " + key);
            System.out.println("POSISI : Berada pada indeks ke-" + posisiIndeks);
        } else {
            System.out.println("HASIL  : Data TIDAK DITEMUKAN!");
            System.out.println("PESAN  : Nilai " + key + " tidak ada di dalam daftar " + nilai.length + " elemen array yang diinputkan.");
        }
        System.out.println("-------------------------------------------");
    }
}