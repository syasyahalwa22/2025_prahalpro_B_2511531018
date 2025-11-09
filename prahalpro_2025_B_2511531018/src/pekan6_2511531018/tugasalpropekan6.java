package pekan6_2511531018;

import java.util.Random;
import java.util.Scanner;

public class tugasalpropekan6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int tries = 0;
		String jawab = "ya";
		
	  	do {
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
 			int sum = dadu1 + dadu2;
 			tries++;
			System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
			
			if (sum == 7) {
				System.out.println("Tebakan Anda Benar");
				System.out.println("Anda menang setelah " + tries + " percobaan!");
				break;
			} else {
				System.out.println("Tebakan Anda Salah");
				System.out.print("Apakah mau lempar dadu (ya/tidak)");
				jawab = input.next();
			}
			
	  	} while (jawab.equals("ya"));
	  	
	  	if (!jawab.equals("ya")) {
	  		System.out.println("Anda gagal menang");
	  	}

		input.close(); 
	
	 
	}
	
}




