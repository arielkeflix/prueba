package modulo1;

public class Nivel1Fase4 {

	public static void main(String[] args) {
		
		final int a�oInicio = 1948;
		final int a�oNacimiento = 1964;				
		
		boolean esBisMiNacimiento = false;

		final String fraseSi = "Yo naci en un a�o bisiesto que es el " + a�oNacimiento;
		final String fraseNo = "Yo naci en: " + a�oNacimiento + " que no fue un  a�o bisiesto  ";
		
		final String nombreCompleto = "Ariel Liffschitz Cohan";
		final String fechaNacimiento = "08/10/" +a�oNacimiento;

		for (int x = a�oInicio + 4; x <= a�oNacimiento; x = x + 4) {			
			
			if (x == a�oNacimiento)
				esBisMiNacimiento = true;
		}
		

		System.out.println("Mi nombre es:" + nombreCompleto);
		System.out.println("Mi fecha de nacimiento es: " + fechaNacimiento);
		if (esBisMiNacimiento)
			System.out.println(fraseSi);
		else
			System.out.println(fraseNo);

	}

}
