package treinamento;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
	//	int idade = 60;
	//	
	//	if (idade >= 18 && idade < 60) {
	//		System.out.println("pode beber");
	//	} else if (idade >= 60) {
	//		System.out.println("pode beber, mas näo sua idade é morte certa!!!");
	//	} else {
	//		System.out.println("nao pode beber");}

		
	//	Scanner enter = new Scanner(System.in);
	//	System.out.println("Escreva um numero");
	//	int num = enter.nextInt();
	//	if (num >=10) {
	//		System.out.println("É maior que 10");
	//	}else {
	//		System.out.println("não é maior que 10");
	//	}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome:");
		String nome = sc.next();
		
		System.out.println("Sexo: ");
		String sexo = sc.next();
		
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		
		char sexoApenasAPrimeiraLetra = sexo.toCharArray()[0];
				
				double pesoIdeal = 0;
				if (sexoApenasAPrimeiraLetra == 'M') {
					pesoIdeal = (72.7 * altura) - 58;
				}
				else {
					pesoIdeal = (62.1 * altura) - 44.7;
				}
		System.out.println(pesoIdeal);
	}

}
