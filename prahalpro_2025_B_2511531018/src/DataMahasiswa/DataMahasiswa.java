package DataMahasiswa;

import java.util.Scanner;

public class DataMahasiswa {

	public static void main(String[] args) {
		
		// Masukkan data
		String nim = "2511531018";
		String nama = "Syasya Halwa Gazwani";
		int umur = 18;
		
		// Konversi umur ke String
		String umurString = String.valueOf(umur);
		
		// Konversi NIM menjadi long lalu tambahkan dengan umur
		long nimLong = Long.parseLong(nim);
		long hasilTambah = nimLong + umur;
		
		// Cetak hasil
		System.out.println("=== Data Mahasiswa ===");
		System.out.println();
		System.out.println("Nama :" + nama);
		System.out.println("NIM :" + nim);
		System.out.println("Umur :" + umur + " tahun");
		System.out.println();
		System.out.println("Umur (String) :" + umurString);
		System.out.println("NIM + Umur :" + hasilTambah);	

	}

}
