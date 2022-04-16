package evaluasi.eval1;

import java.util.Scanner;

public class SoalSatu {
	public int getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai N: ");
		int n = scan.nextInt();
		scan.close();
		return n;
	}
	 
	public void polaGanjil() {
		System.out.println("Halo ini Testing Git nya!");
		int n = getInput();
		for (int i=1; i <=n*2; i++) {
			if (i%2!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int i=n*2; i>0; i--) {
			if (i%2==1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		SoalSatu run = new SoalSatu();
		run.polaGanjil();
	}
	
}
