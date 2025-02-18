package estudos18_02;

import java.util.Scanner;

public class NumPerfeito {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um Numero");
		int numero = scanner.nextInt();
		int soma = 0 ;
		
		for ( int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				soma += i;
				
			}
		}
       
		if (soma == numero ) {
			System.out.println(numero + "é um numero perfeito");
		}else {
			System.out.println(numero + " não é perfeito");
		}
		scanner.close();
	}

}
