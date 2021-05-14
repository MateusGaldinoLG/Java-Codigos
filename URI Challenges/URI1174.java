package uri;

import java.util.Scanner;

public class URI1174 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] vetor = new double[100];
		
		for(int i = 0; i < 100; i++) {
			vetor[i] = s.nextDouble();
		}
		
		for(int i = 0; i < 100; i++) {
			if(vetor[i] <= 10) {
				System.out.println("A["+i+"] = "+vetor[i]);
			}
		}
		
	}

}
