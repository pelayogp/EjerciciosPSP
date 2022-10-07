package Ejemplos.Unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {
	private static String linea;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Teclea el numero 1");
			linea = br.readLine();
			double n1 = Double.parseDouble(linea);
			System.out.println("Teclea el numero 2");
			linea = br.readLine();
			double n2 = Double.parseDouble(linea);
			System.out.println("La suma de los numeros: "+ n1 + "+ "+ n2 + " = "+  (n1 + n2) );
		} catch (NumberFormatException e) {
			System.out.println("Error: " + linea + " no es un numero");
			System.exit(-1);
		}

	}

}
