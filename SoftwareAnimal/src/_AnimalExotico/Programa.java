package _AnimalExotico;

import java.util.Scanner;

import Animal.Peixe;

public class Programa {

	public static void main(String[] args) {
		//Peixes inseto = new Peixes();
		
				Scanner read = new Scanner(System.in);
				String nome, nomeCientifico, tamanho, pesoMedio, longevidade, origem;
				String tipoAgua;
				
				System.out.println("Digite o nome do seu animal");
				nome = read.next();
				
				System.out.println("Digite o nome cientifico do seu animal");
				nomeCientifico = read.next();
				
				System.out.println("Digite o tammanho do seu animal");
				tamanho = read.next();
				
				System.out.println("Digite o peso m�dio do seu animal");
				pesoMedio = read.next();
				
				System.out.println("Digite a longevidade do seu animal");
				longevidade = read.next();
				
				System.out.println("Digite a origem do seu animal");
				origem = read.next();
						
				System.out.println("Digite O tipo de agua do seu animal");
				tipoAgua = read.next();
				
				
				Peixe animalDados = new Peixe(nome,	nomeCientifico, tamanho, pesoMedio, longevidade, origem, tipoAgua);
				
				animalDados.armazenarDados(animalDados);
				animalDados.imprimir();
	}

}
