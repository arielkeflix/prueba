package modulo1;

public class Nivel1Fase2 {

	public static void main(String[] args) {

		final int a�oInicio = 1948;
		int cantBisiestos = 0;
		int bisiestos;

		for (int x = a�oInicio; x < 1964;) {
			x = x + 4;			
			cantBisiestos++;
		}
		bisiestos = cantBisiestos;

		System.out.println("La cantidad de bisiestos desde 1948 hasta mi a�o de nacimiento son: " + bisiestos);

	}

}
