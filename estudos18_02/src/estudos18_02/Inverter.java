package estudos18_02;

import java.util.Scanner;

public class Inverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um Numero");
		int numero = scanner.nextInt();
		int invertido = 0;
		
		
		while (numero >0 ) {
			int digito = numero % 10 ;
			invertido = invertido * 10 + digito ;
			numero /=10;
		}

		System.out.print("Numero Invertido: " + invertido);
		scanner.close();
	}

}
