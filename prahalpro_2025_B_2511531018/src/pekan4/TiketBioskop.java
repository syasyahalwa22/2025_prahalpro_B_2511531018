package pekan4;

import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Pembeli: ");
        String nama = input.nextLine();
        System.out.print("Jumlah Tiket: ");
        int jumlahTiket = input.nextInt();
        System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        int hari = input.nextInt();
        System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
        int waktu = input.nextInt();
        System.out.print("Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        int studio = input.nextInt();

        double hargaDasar = 50000;
        double biayaHari = 0, biayaWaktu = 0, biayaStudio = 0;
       
        if (hari == 2) { 
            biayaHari = 0.10;
        } else if (hari == 3) { 
            biayaHari = 0.30;
        }

        if (waktu == 2) { 
            biayaWaktu = 0.10;
        } else if (waktu == 3) { 
            biayaWaktu = 0.20;
        }

        if (studio == 2) { 
            biayaStudio = 0.20;
        } else if (studio == 3) { 
            biayaStudio = 0.35;
        }

        double hargaPerTiket = hargaDasar + 
                               (hargaDasar * biayaHari) + 
                               (hargaDasar * biayaWaktu) + 
                               (hargaDasar * biayaStudio);

        double subtotal = hargaPerTiket * jumlahTiket;

        double diskon = 0;
        if (subtotal > 250000) {
            diskon = subtotal * 0.20;
        }

        double totalBayar = subtotal - diskon;

        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli     : " + nama);
        System.out.println("Jumlah Tiket     : " + jumlahTiket);
        System.out.println("Hari             : " + 
                           (hari==1?"Senin-Kamis":hari==2?"Jumat":"Sabtu-Minggu"));
        System.out.println("Waktu Tayang     : " + 
                           (waktu==1?"Pagi":waktu==2?"Siang":"Malam"));
        System.out.println("Jenis Studio     : " + 
                           (studio==1?"Regular":studio==2?"Deluxe":"Premium"));
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar      : Rp " + (int)hargaDasar + "/tiket");
        System.out.println("Biaya Hari       : +" + (int)(biayaHari*100) + "%");
        System.out.println("Biaya Waktu      : +" + (int)(biayaWaktu*100) + "%");
        System.out.println("Biaya Studio     : +" + (int)(biayaStudio*100) + "%");
        System.out.println("Harga per Tiket  : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal         : Rp " + (int)subtotal);
        System.out.println("Diskon (20%)     : Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR      : Rp " + (int)totalBayar);

        input.close();
    }
}

	

	
	

