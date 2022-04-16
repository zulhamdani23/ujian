package evaluasi.eval1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SoalDua {
	public static Scanner scan = new Scanner(System.in);

	public static int getInput() {
		System.out.print("Masukkan uang anda: ");
		int n = scan.nextInt();
		return n;
	}

	public static int[] getArray1() {
		System.out.println("Masukkan harga kaca mata");
		int[] kaca = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Harga ke " + (i + 1) + ": ");
			int bil = scan.nextInt();
			kaca[i] = bil;
		}
		System.out.print("Harga kaca mata: " + Arrays.toString(kaca));
		System.out.println();
		return kaca;
	}

	public static int[] getArray2() {
		System.out.println("Masukkan harga baju");
		int[] baju = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Harga ke " + (i + 1) + ": ");
			int bil = scan.nextInt();
			baju[i] = bil;
		}
		System.out.print("Harga baju: " + Arrays.toString(baju));
		System.out.println();
		return baju;
	}

	public int[] hitung() {
		int[] kaca = getArray1();
		int[] baju = getArray2();
		int[] hasil = new int[9];
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				hasil[k] = (kaca[i] + baju[j]);
				k++;
			}
		}
		return hasil;
	}
	
	public ArrayList<Integer> cetak() {
		int n = getInput();
		int[] hasil = hitung();
		ArrayList<Integer> cukup = new ArrayList<Integer>();
		System.out.println("Kombinasi: " + Arrays.toString(hasil));
		for (int i=0; i<hasil.length;i++) {
			if (hasil[i] <= n) {
				cukup.add(hasil[i]);
			}
		}
		return cukup;
	}
	
	public void kondisi() {
		ArrayList<Integer> cukup = cetak();
		System.out.println("Cukup : " + cukup);
		if (cukup.size() != 0) {
			Integer max = Collections.max(cukup);
			System.out.print("Hasil = " + max);
		} else {
			System.out.print("Uang Tak Cukup");
		}
	}
	 
	
	public static void main(String[] args) {
		SoalDua run = new SoalDua();
		run.kondisi();
	}

}
