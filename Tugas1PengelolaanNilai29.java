import java.util.Scanner;

public class Tugas1PengelolaanNilai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int n = scanner.nextInt();

        int[] nilaiMahasiswa = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
            total += nilaiMahasiswa[i];
        }

        double rataRata = (double) total / n;

        int tertinggi = nilaiMahasiswa[0];
        int terendah = nilaiMahasiswa[0];

        for (int i = 1; i < n; i++) {
            if (nilaiMahasiswa[i] > tertinggi) {
                tertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < terendah) {
                terendah = nilaiMahasiswa[i];
            }
        }

        System.out.println("\n--- STATISTIK NILAI MAHASISWA ---");
        System.out.println("Nilai Rata-rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);

        System.out.println("\n--- DAFTAR STATUS KELULUSAN ---");
        for (int i = 0; i < n; i++) {
            String status = (nilaiMahasiswa[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i] + " (" + status + ")");
        }

        scanner.close();
    }
}