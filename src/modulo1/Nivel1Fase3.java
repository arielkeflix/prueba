package modulo1;

public class Nivel1Fase3 {

	public static void main(String[] args) {

		final int a�oInicio = 1948;
		final int a�oNacimiento = 1964;

		int cantBisiestos = 0;
		int bisiestos;
		
		boolean esBisMiNacimiento = false;

		final String fraseSi = "Yo naci en un a�o bisiesto que es el " + a�oNacimiento;
		final String fraseNo = "Yo naci en: " + a�oNacimiento + " que no fue un  a�o bisiesto  ";

		for (int x = a�oInicio + 4; x <= a�oNacimiento; x = x + 4) {

			System.out.println("a�os bisiesto  " + x);
			cantBisiestos++;
			if (x == a�oNacimiento)
				esBisMiNacimiento = true;
		}
		bisiestos = cantBisiestos;

		System.out.println("La cantidad de bisiestos desde 1948 hasta mi a�o de nacimiento son:  " + bisiestos);
		if (esBisMiNacimiento)
			System.out.println(fraseSi);
		else
			System.out.println(fraseNo);

	}

}
