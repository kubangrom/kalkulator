package kalkulator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
	private static Scanner wybor;

	void meni(String[] args) throws FileNotFoundException, Exception {

		int a;
		System.out.println("Kalkulator");
		System.out.println("MENU\n1.Obliczenia z konsoli\n2.Obliczenia z pliku\n");
		wybor = new Scanner(System.in);
		a = wybor.nextInt();
		if (a == 1) {
			opcja1 o1 = new opcja1();
			o1.jeden(args);
		}
		if (a == 2) {
			opcja2 o2 = new opcja2();
			o2.dwa(args);

		}
	}
}
