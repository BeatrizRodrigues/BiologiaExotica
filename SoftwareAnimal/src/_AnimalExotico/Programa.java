package _AnimalExotico;

import java.util.Scanner;

import Animal.Peixe;

public class Programa {

	public static void main(String[] args) {
		Peixe animalDados = new Peixe("bia", "bia", "cafe", "sdbi", "hefbwi", "vaeif", "sdhfb");
		animalDados.armazenarDados(animalDados);
		Peixe animal = new Peixe("shjdvf","shjdvf", "shjdvf", "shjdvf","shjdvf", "shjdvf","shjdvf");
		animalDados.armazenarDados(animal);
		
		animalDados.imprimir();
			
	}

}
