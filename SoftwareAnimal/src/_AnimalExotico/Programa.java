package _AnimalExotico;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
				Scanner read = new Scanner(System.in);
				String nome, nomeCientifico, tamanho, pesoMedio, longevidade, origem;
				String tipoAgua;
				
				
				Repteis r = new Repteis();	
				Aves a = new Aves();
				
				r.adicionaAnimal(a);
				
				
				r.mostraaNIMAL(a);
				
				
				
			
	}

}
