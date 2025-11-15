package pekan7_2511531018;

import java.util.Scanner;

public class tugasAlproPekan7_2511531018 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Akun akun = new Akun();
		
		System.out.println("=== REGISTRASI AKUN BARU ===");

		System.out.print("Masukkan Username: ");
		String username= input.nextLine();
		akun.setUsername(username);
		System.out.print("Masukkan Password: ");
		String password= input.nextLine();
		akun.setPassword(password);
		System.out.print("Masukkan Email: ");
		String email= input.nextLine();
		akun.setEmail(email);
		System.out.print("Masukkan PIN (6 digit): ");
		int pinAngka= input.nextInt();
		akun.setPinAngka(pinAngka);
		
		input.nextLine();
		
		if (akun.isPasswordValid() && akun.isEmailValid()) {
			System.out.println("--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk " + akun.getUsername() +" telah berhasil dibuat.");
			System.out.println("");
			System.out.println("--- Detail Akun ---");
			System.out.println("Username    : " + akun.getUsername());
			System.out.println("Email       : " + akun.getEmail());
			System.out.println("ID Pengguna : " + akun.getUsername() + akun.getPinAngka());
			System.out.println("");
			System.out.println("--- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");
			int pinResult = akun.getPinAngka() + 10;
			System.out.println("PIN (int)    = " + pinResult);
			System.out.println("PIN (String) = " + akun.getPinAngka() + "10");
		} else {
			System.out.println("--- REGISTRASI GAGAL ---");
			if (!akun.isPasswordValid()) {
				System.out.println("Password Anda tidak valid (harus mengandung 8 karakter atau lebih).");
			if (!akun.isEmailValid()) {
				System.out.println("Email Anda " + akun.getEmail() + " tidak valid (harus mengandung '@' dan '.').");
			}
			System.out.println("Silahkan coba lagi.");
		}
		input.close();
		}
	}
}