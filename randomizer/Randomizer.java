package randomizer;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer implements Layout {
	private int minimo;
	private int maximo;
	private int tamanho;

	public static final Random r = new Random();
	
	public int randomNumber(int minimo, int maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
		int intervalo = this.maximo - this.minimo;
		int randomNumber = r.nextInt(intervalo + 1);
		if (minimo > 1) {
			randomNumber += minimo;
		}
		else if (minimo == 1) {
			randomNumber += 1;
		}
		return randomNumber;
	}
	
	public ArrayList<Integer> randomArray(int minimo, int maximo, int tamanho) {
		this.minimo = minimo;
		this.maximo = maximo;
		this.tamanho = tamanho;
		int intervalo = this.maximo - this.minimo;
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int[] numeros = new int[tamanho];
		for(int i = 0; i < tamanho; ++i) {
			numeros[i] = r.nextInt(intervalo + 1);
		}
		
		if(minimo > 1) {
			for(int i = 0; i < tamanho; ++i) {
				numeros[i] += minimo;
			}
		}
		else if(minimo == 1) {
			for(int i = 0; i < tamanho; ++i) {
				numeros[i] += 1;
			}
		}
		for(int numero: numeros) {
			array.add(numero);
		}
		return array;
		
	}
	
	public String corHex() {
		String cor = "#";
		String possiveis = "0123456789ABCDEF";
		char novoCaracter;
		
		for(int i = 0; i < 6; i++) {
			novoCaracter = possiveis.charAt(r.nextInt(16));
			cor += novoCaracter;
		}
		return cor;
	}
	
}
