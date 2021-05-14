package uri;

import java.util.Scanner;

public class URI1177 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[1000];
		int entrada;
		//int contador = 0;
		
		do {
			entrada = s.nextInt();
		}while(entrada <= 2 || entrada >= 50);
		
		for(int i = 0; i < 1000; i++) {
			array[i] = (entrada+i)%entrada;
		}
		for(int i = 0; i < 1000; i++) {
			System.out.println("N["+i+"] = "+array[i]);
		}
		
		//compact solution
//		for(int i = 0; i < 1000; i++) {
//			System.out.printf("N[%d] = %d%n",i,contador);
//			contador++;
//			if(contador == entrada) {
//				contador = 0;
//			}
//		}
	}

}
