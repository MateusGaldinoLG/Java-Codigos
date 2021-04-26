package randomizer;

import java.util.ArrayList;

public interface Layout {
	
		int randomNumber(int minimo, int maximo);
		ArrayList<Integer> randomArray(int minimo, int maximo, int tamanho);
		String corHex();
}
