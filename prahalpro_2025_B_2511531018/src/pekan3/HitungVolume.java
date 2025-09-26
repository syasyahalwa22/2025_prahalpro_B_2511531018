package pekan3;

import java.util.Scanner;
public class HitungVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jari-jari kerucut: ");
		double r = input.nextDouble();
		System.out.print("Masukkan tinggi kerucut");
		double t = input.nextDouble();
		double volume = (1.0 / 3.0) * Math.PI * r * r * t;
		System.out.println("Volume kerucut = " + volume);
		
		input.close();
		
	}

}
