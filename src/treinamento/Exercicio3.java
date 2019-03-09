package treinamento;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		double cont=0, media, aux=0;
	//	int idade = 1;
	//	while (idade <= 10) {
	//		System.out.println("idade atual: " + idade);
	//		idade += 1;
	//	}
		
		
	//	int idade =10;
	//	while (idade >=1) {
	//		System.out.println("idade atual :" + idade) ;
	//	idade -= 1;
	//	}
		
		
	/*	int numero = 101;
				while (numero <=110) {
					System.out.println(" numero:"+ numero);
					numero +=1;
				}*/
		
	/*	int numero ;
				for (numero =1; numero <=100; numero++) {
					System.out.println("numero"+numero);
				}*/
		
	/*	int numero;
		for(numero =15; numero<=100; numero++) {
			System.out.println("numero"+numero);
			cont++;
			aux =numero+aux;
			
	
		}
		media=aux/cont;
			System.out.println(media);
	}*/
		
		Scanner sc= new Scanner(System.in);
		int x=0, num1, aux2=0;
		while (x<10) {
			System.out.println("digite seu numero");
			num1=sc.nextInt();
			if (num1<40) {
				aux2=num1+aux2;
				x++;
			}else {
				x++;
			}
		}
		System.out.println(aux2);
	}
}
