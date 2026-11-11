import java.util.Scanner;

public class Tugas2KafeKampus29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=================================");
        System.out.println("     DAFTAR MENU KAFE KAMPUS     ");
        System.out.println("=================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("=================================\n");

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cariMenu = scanner.nextLine();
        boolean ditemukan = false;
        int indeksDitemukan = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                indeksDitemukan = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("-> Menu \"" + menu[indeksDitemukan] + "\" tersedia dengan harga Rp " + harga[indeksDitemukan] + "\n");
        } else {
            System.out.println("-> Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe kampus.\n");
        }

        System.out.print("Masukkan jumlah jenis item yang ingin dipesan: ");
        int jumlahJenisPesanan = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaPesanan = new String[jumlahJenisPesanan];
        int[] jumlahPesanan = new int[jumlahJenisPesanan];
        int[] subtotalHarga = new int[jumlahJenisPesanan];
        int totalBiayaKeseluruhan = 0;

        for (int i = 0; i < jumlahJenisPesanan; i++) {
            boolean menuValid = false;
            while (!menuValid) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + " yang ingin dipesan: ");
                String inputMenu = scanner.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(inputMenu)) {
                        menuValid = true;
                        namaPesanan[i] = menu[j];
                        break;
                    }
                }

                if (!menuValid) {
                    System.out.println("Menu tidak valid atau tidak tersedia. Silakan masukkan ulang.");
                }
            }

            System.out.print("Masukkan jumlah porsi untuk " + namaPesanan[i] + ": ");
            jumlahPesanan[i] = scanner.nextInt();
            scanner.nextLine();

            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaPesanan[i])) {
                    hargaSatuan = harga[j];
                    break;
                }
            }

            subtotalHarga[i] = hargaSatuan * jumlahPesanan[i];
            totalBiayaKeseluruhan += subtotalHarga[i];
        }

        System.out.println("\n==================================================");
        System.out.println("              STRUK PESANAN KAFE KAMPUS           ");
        System.out.println("==================================================");
        System.out.printf("%-20s | %-6s | %s\n", "Nama Menu", "Jumlah", "Subtotal");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < jumlahJenisPesanan; i++) {
            System.out.printf("%-20s | %-6d | Rp %d\n", namaPesanan[i], jumlahPesanan[i], subtotalHarga[i]);
        }
        System.out.println("------------------------------------------------==");
        System.out.println("Total Biaya Keseluruhan       : Rp " + totalBiayaKeseluruhan);
        System.out.println("==================================================");

        scanner.close();
    }
}