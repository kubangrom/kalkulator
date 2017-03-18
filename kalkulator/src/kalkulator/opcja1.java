package kalkulator;

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class opcja1 {
	private static Scanner obliczenie;

	void jeden(String[] args) throws FileNotFoundException, Exception {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		String obl;
		do {

			System.out.print("Wpisz obliczenia, ktore chcesz wykonac");
			System.out.print("\n");
			obliczenie = new Scanner(System.in);
			obl = obliczenie.nextLine();
			if (obl.endsWith("end") == true) {
				System.out.println("Wpisa³eœ end przenoszê do MENU");
				break;
			}
			System.out.print(obl + "=" + engine.eval(obl) + "\n");
		} while (obl.endsWith("end") == false);
		Menu m2=new Menu();
		m2.meni(args);
	}
}
