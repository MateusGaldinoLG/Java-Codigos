package projetosimples;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		Random escolha = new Random();
		
		int numeroMinimo, numeroMaximo;
		int intervalo;
		
		System.out.println("Escreva o limite m�nimo: ");
		numeroMinimo = s.nextInt();
		System.out.println("Escreva o limite m�ximo: ");
		numeroMaximo = s.nextInt();
		
		while (numeroMinimo == numeroMaximo || (numeroMinimo < 0 || numeroMaximo <0) || numeroMinimo > numeroMaximo) {
			System.out.println("O intervalo que voc� digitou est� incorreto, tente novamente");
			System.out.println("Escreva o limite m�nimo: ");
			numeroMinimo = s.nextInt();
			System.out.println("Escreva o limite m�ximo: ");
			numeroMaximo = s.nextInt();
		}
		
		intervalo = numeroMaximo - numeroMinimo;
		
		int numeroFinal = escolha.nextInt(intervalo+1);
		
		if (numeroMinimo > 1) {
			numeroFinal = numeroFinal + numeroMinimo;
		}
		else if (numeroMinimo == 1) {
			numeroFinal += 1;
		}
		
		System.out.println("O numero aleat�rio �: "+numeroFinal);
		s.close();
		
	}
}
