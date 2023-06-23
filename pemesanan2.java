//untuk membaca inputan dari user
import java.util.Scanner;

//deklarasi class
public class pemesanan2 {

        public static void main(String[] args) {
            String[] menu = {"Nasi Goreng", "Mie Goreng", "Sate Ayam", "Ayam Bakar", "Soto Ayam"};
            //tempat membuat array menu

            int[] harga = {15000, 12000, 20000, 25000, 15000};
            //tempat membuat array harga dalam menu

            //array yg pesanan yang panjang mengkikuti panjang array
            int[] pesanan = new int[menu.length];
            Scanner scanner = new Scanner(System.in);

            //untuk menampung nama pemesan
            System.out.println("======= Sistem Pemesanan =======");
            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();


            // untuk memunculkan menu harga dengan looping , +1 di gunakan agar menu tidak di mulai dari 0
            System.out.println("====== Menu Makanan =======: ");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " = Rp" + harga[i]);
            }


            System.out.print("Pilih menu (masukkan nomor menu yang ingin dipesan): ");
            int pilihanMenu = scanner.nextInt();

            // untuk menginialisasi kurang dari 0 atau lebih besar dari menu
            if (pilihanMenu < 1 || pilihanMenu > menu.length) {
                System.out.println("Pilihan menu tidak tersedia!");
                scanner.close();
                return;
            }

            //untuk membaca inputan berapa pesanan dari user
            System.out.print("Masukkan jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();


            // -1 karena array mulai dari (0)
            pesanan[pilihanMenu - 1] = jumlahPesanan;
            System.out.println("Pemesan makanan adalah " + nama + ":");

            int totalHarga = 0;
            for (int i = 0; i < menu.length; i++) {
                if (pesanan[i] > 0) {
                    System.out.println(menu[i] + " berjumlah " + pesanan[i] + " porsi dengan harga = Rp" + (harga[i] * pesanan[i]));
                    totalHarga += harga[i] * pesanan[i];

                }
            }

            System.out.println("Total Harga: Rp" + totalHarga);
            scanner.close();
        }
    }

