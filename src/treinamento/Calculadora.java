package treinamento;

import java.util.Scanner;

public class Calculadora {
	
		public double calcula (int numero1,int numero2, String operador ) {
			
			
			
			
			switch (operador) {
			case "+":
			return numero1 + numero2;	
			case "-":
				return numero1 - numero2;
			case "*":
				return numero1 * numero2;
			case "/":
				return numero1 / numero2;
			default:
				throw new IllegalArgumentException("operador invalido");
			}
			
		}
}
