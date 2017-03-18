package kalkulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class opcja2 {
	private static Scanner in;

	void dwa(String[] args) throws FileNotFoundException, Exception {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		System.out.println("Obliczenia z pliku");
		File file = new File("C:/Users/DOM PC/Desktop/Java/kalkulator/bin/kalkulator/123.txt");
		in = new Scanner(file);
		while (in.hasNextLine()) {
			String zdanie = in.nextLine();
			System.out.println(zdanie + "=" + engine.eval(zdanie));
		}

	}
}
