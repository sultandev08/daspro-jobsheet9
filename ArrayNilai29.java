import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++; 
            }
        }
        System.out.println("\n--- Rekapitulasi Hasil Mahasiswa ---");
        System.out.println("Jumlah mahasiswa yang lulus (> 70): " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus (<= 70): " + jumlahTidakLulus);
    }
}