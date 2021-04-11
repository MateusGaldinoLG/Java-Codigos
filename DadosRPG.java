package projetosimples;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DadosRPG {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numDeDados, acrescimo, total, faceEscolhida = 0;
		int soma = 0;
		char escolha = 'n';
		
		ArrayList<Integer> faces = new ArrayList<Integer>();
		faces.add(20);
		faces.add(12);
		faces.add(10);
		faces.add(8);
		faces.add(6);
		faces.add(4);
		
		
		System.out.println("Digite o número de dados: ");
		numDeDados = input.nextInt();
		
		while (escolha != 's') {
			System.out.println("Digite a quantidade de faces: \n(quantidades possíveis: 4, 6, 8, 10, 12, 20) ");
			faceEscolhida = input.nextInt();
			if(faces.contains(faceEscolhida)) {
				escolha = 's';
			}
			else {
				System.out.println("Número de faces incorreto, escreva novamente.");
			}
		}
		
		System.out.println("Digite o acrescimo (se não houver, digite 0):");
		acrescimo = input.nextInt();
		
		int[] rolagens = new int[numDeDados];
		
		for(int i = 0; i < numDeDados; ++i) {
			rolagens[i] = Rolagem(faceEscolhida);
			soma += rolagens[i];
		}
		
		
		total = soma + acrescimo;
		if(acrescimo == 0) {
			System.out.println("A rolagem de " + numDeDados +"d" + faceEscolhida + " foi " + total );
		}
		else {
			System.out.println("A rolagem de " + numDeDados +"d" + faceEscolhida + " + " + acrescimo + " foi " + total );
		}
		
	}
	
	public static int Rolagem(int y) {
		Random random = new Random();
		int resultadoFace = 1 + random.nextInt(y);
		return resultadoFace;
	}
	
}
