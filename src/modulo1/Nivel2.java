package modulo1;

public class Nivel2 {

	public static void main(String[] args) {
		
		double varDouble = 1.2345;
		int varInt;
		float varFloat;
		String varString;

		varInt = (int) varDouble;
		varFloat = (float) varDouble;
		varString = String.valueOf(varDouble);
		
		System.out.println("El valor de la variable double es: " + varDouble);
		System.out.println("Convirti�ndola a un int el valor es : " + varInt);
		System.out.println("Convirti�ndola a un float el valor es : " + varFloat);
		System.out.println("Convirti�ndola a un String el valor es : " + varString);

	}

}
