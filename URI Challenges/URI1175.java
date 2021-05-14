package uri;

import java.util.Scanner;

public class URI1175 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[20];
		int troca = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		
		for(int i = 0; i < array.length/2; i++) {
			troca = array[array.length-(i+1)];
			array[array.length-(i+1)] = array[i];
			array[i] = troca;
//			System.out.println(array[3-i]);
//			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("N["+i+"] = "+array[i]);
		}
	}

}
