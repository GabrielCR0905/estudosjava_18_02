package estudos18_02;

import java.util.Scanner;

public class ContadorDigitos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero : ");
		int numero = scanner.nextInt();
		
		int pares = 0, impares = 0;
		
		while( numero > 0) {
			int digito = numero % 10;
			if (digito % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			numero /= 10;
		}

		System.out.print("Digitos Pares :" + pares);
		System.out.print("Digitos Impares : " + impares);
		scanner.close();
	}

}
