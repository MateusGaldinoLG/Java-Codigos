package randomizer;

import java.util.Scanner;

public class Tester {

	public static final Scanner s = new Scanner(System.in);
	public static final Randomizer random = new Randomizer();
	
	public static void main(String[] args) {
		String escolha;
		
		System.out.println("Esse aplicativo possui as seguintes possibilidades: "
				+ "\nRandom number generator (RNG)"
				+ "\nRandom row generator(RRG) "
				+ "\nRandom Color Generator (RCG)");
		System.out.println("Escolha um deles:");
		escolha = s.nextLine();
		
		/*
		while(minimo == maximo || (minimo < 0 || maximo <0) || minimo > maximo) {
			System.out.println("Digite o valor minimo: ");
			minimo = s.nextInt();
			System.out.println("Digite o valor maximo");
			maximo = s.nextInt();
			if(minimo >= maximo) {
				System.out.println("O valor maximo deve ser maior que o valor minomo. Digite novamente: ");
			}
		}
		*/
		if(escolha.equals("RNG")) {
			RNG();
		}
		else if(escolha.equals("RRG")) {
			RRG();
		}
		else if(escolha.equals("RCG")){
			System.out.println("a cor gerada foi:" + random.corHex());
		}
		else {
			System.out.println("Escolha incorreta");
		}	
	}
	
	public static void RNG() {
		int minimo = 0;
		int maximo = 0;
		System.out.println("Random Number Generator Escolhido");
		while(minimo == maximo || (minimo < 0 || maximo <0) || minimo > maximo) {
			System.out.println("Digite o valor minimo: ");
			minimo = s.nextInt();
			System.out.println("Digite o valor maximo");
			maximo = s.nextInt();
			if(minimo >= maximo) {
				System.out.println("O valor maximo deve ser maior que o valor minomo. Digite novamente: ");
			}
		}
		System.out.println("Seu número é" + random.randomNumber(minimo, maximo));
	}
	
	public static void RRG() {
		int minimo, maximo, tamanho;
		
		System.out.println("Random Row Generator Escolhido");
		do{
			System.out.println("Digite o valor minimo: ");
			minimo = s.nextInt();
			System.out.println("Digite o valor maximo");
			maximo = s.nextInt();
			System.out.println("Digite o tamanho da coluna que você quer gerar: ");
			tamanho = s.nextInt();
			if(minimo >= maximo) {
				System.out.println("O valor maximo deve ser maior que o valor minomo. Digite novamente: ");
			}
			if(tamanho <=0) {
				System.out.println("O tamanho da coluna precisa ser maior que 0");
			}
		}while(minimo == maximo || (minimo < 0 || maximo <0) || minimo > maximo || tamanho <= 0);
		
		System.out.println("Sua coluna é " + random.randomArray(minimo, maximo, tamanho));
	}
	
}

