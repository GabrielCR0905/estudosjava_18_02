package estudos18_02;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite quantos termos deseja ver: ");
		int n = scanner.nextInt();
		
		int a = 0, b = 1;
		
		System.out.print("Sequencia de Fibonacci: "+ a + "" + b + "");
 
		
		for(int i = 2; i < n; i++) {
			int proximo = a + b;
			System.out.print(proximo + "");
			a = b;
			b = proximo;
			
		}
		scanner.close();
	}

}
