package uri;

import java.util.Scanner;

public class URI1173 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int valor;
		int[] vetor = new int[10];
		
		do {
		valor = s.nextInt();
		}while(valor > 50);
		
		vetor[0] = valor;
		
		for(int i = 1; i < 10; i++) {
			vetor[i] = 2*vetor[i-1];
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("N["+i+"] = "+vetor[i]);
		}

	}

}
