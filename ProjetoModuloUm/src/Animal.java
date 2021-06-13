import java.util.ArrayList;
import java.util.Scanner;



public class Animal extends InterfaceAnimal {

	public static void main(String[] args) {
		ArrayList<InterfaceAnimal> list = new ArrayList<InterfaceAnimal>();	
		Scanner ler = new Scanner(System.in);
		String especie, nome, nomeCientifico, origem, remover;
		Double tamanho, pesoMedio, velocidadeMaxima;
		int longevidade;
		int op;
		
		do {
			InterfaceAnimal animal = new InterfaceAnimal();
			System.out.println("\n###Opções###");
			System.out.println("[1] Cadastrar novo animal");
			System.out.println("[2] Remover animal");
			System.out.println("[3] Imprimir lista de animais");
			System.out.println("[0] Sair");
				op = ler.nextInt();
			
			
			switch(op) {
			case 1:
				System.out.println("Qual a especie do animal ? ");
				especie = ler.next();
				animal.setEspecie(especie);
				System.out.println("Qual o nome do animal ? ");
				nome = ler.next();
				animal.setNome(nome);
				System.out.println("Qual o nome científico do animal ? ");
				nomeCientifico = ler.next();
				animal.setNomeCientifico(nomeCientifico);
				System.out.println("Qual o tamanho do animal ? ");
				tamanho = ler.nextDouble();
				animal.setTamanho(tamanho);
				System.out.println("Qual o peso médio do animal ? ");
				pesoMedio = ler.nextDouble();
				animal.setPesoMedio(pesoMedio);
				System.out.println("Qual a velocidade maxima do animal ? ");
				velocidadeMaxima = ler.nextDouble();
				animal.setVelocidadeMaxima(velocidadeMaxima);
				System.out.println("Qual a expectativa de vida do animal ? ");
				longevidade = ler.nextInt();
				animal.setLongevidade(longevidade);
				System.out.println("Qual a origem do animal ? ");
				origem = ler.next();
				animal.setOrigem(origem);
				
				list.add(animal);
				
				break;
			case 2:
				System.out.println("Digite o nome do animal deseja remover ");
				remover = ler.next();
				for(int i = 0; i < list.size(); i++) {
					InterfaceAnimal p = list.get(i);
					if(p.getNome().equals(remover)) {
						list.remove(p);
						System.out.println("Animal removido");
					}
				}
				break;
			case 3:
				System.out.println("\n\t"+"Animais ");
				for(int i = 0; i<list.size(); i++) {				
						System.out.println("\n" + "Especie: "+list.get(i).getEspecie() + " | "+
						"Nome: "+list.get(i).getNome() + " | " + "Nome científico: " + list.get(i).getNomeCientifico() + " | "
						+ "Origem: " + list.get(i).getOrigem() + " | " + "Tamanho: " + list.get(i).getTamanho() + " | "
						+ "Peso médio: " + list.get(i).getPesoMedio() + " | " + "Longevidade: " + list.get(i).getLongevidade() + " | \n");
									
				}
				break;
			}
			
			
		}while(op!=0);

	}
	
	
}

