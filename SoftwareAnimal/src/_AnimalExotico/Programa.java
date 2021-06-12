package _AnimalExotico;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insetos inseto = new Insetos();
		
		Scanner read = new Scanner(System.in);
		String nome, nomeCientifico, tamanho, pesoMedio, longevidade, origem;
		String curiosidade, habilidade;
		
		System.out.println("Digite o nome do seu animal");
		nome = read.next();
		
		inseto.setNome(nome);
		
		System.out.println("Digite o nome cientifico do seu animal");
		nomeCientifico = read.next();
		
		inseto.setNomeCientifico(nomeCientifico);
		
		System.out.println("Digite o tammanho do seu animal");
		tamanho = read.next();
		
		inseto.setTamanho(tamanho);
		
		System.out.println("Digite o peso médio do seu animal");
		pesoMedio = read.next();
		
		inseto.setPesoMedio(pesoMedio);
		
		System.out.println("Digite a longevidade do seu animal");
		longevidade = read.next();
		
		inseto.setLongevidade(longevidade);
		
		System.out.println("Digite a origem do seu animal");
		origem = read.next();
		
		inseto.setOrigem(origem);
		
		System.out.println("Digite uma curiosidade do seu animal");
		curiosidade = read.next();
		
		inseto.setCuriosidade(curiosidade);
		
		System.out.println("Digite uma habilidade do seu animal");
		habilidade = read.next();
		
		inseto.setHabilidade(habilidade);
		
		Animal animalDados = new Animal(nome,
				nomeCientifico,
				tamanho,
				pesoMedio,
				longevidade,
				origem);
		
	/*	Insetos insetosDados = new Insetos(nome,
				nomeCientifico,
				tamanho,
				pesoMedio,
				longevidade,
				origem,
				curiosidade,
				habilidade); */
		
		inseto.addAnimal(animalDados);
		// inseto.addInsetos(insetosDados);

		inseto.printAnimal();
		
		inseto.printInsetos();
		
		
	}

}
