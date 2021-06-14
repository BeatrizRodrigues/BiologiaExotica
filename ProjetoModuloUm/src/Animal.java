import java.util.ArrayList;
import java.util.Scanner;



public class Animal extends ReinoAnimal {

	public static void main(String[] args) {
		try {
			ArrayList<ReinoAnimal> list = new ArrayList<ReinoAnimal>();	
			Scanner ler = new Scanner(System.in);
			Scanner ler2 = new Scanner(System.in);
			String especie, nome, nomeCientifico, origem, remover;
			Double tamanho, pesoMedio, velocidadeMaxima;
			int contPonto = 0;
			int longevidade;
			int op;
			
			do {
				ReinoAnimal animal = new ReinoAnimal();
				System.out.println("\n###Opções###");
				System.out.println("[1] Cadastrar novo animal");
				System.out.println("[2] Remover animal");
				System.out.println("[3] Imprimir lista de animais");
				System.out.println("[4] Informações sobre as classes de Animais");
				System.out.println("[5] Verifique a sua pontuação");
				System.out.println("[0] Sair");
					op = ler.nextInt();
				
				
				switch(op) {
				case 1:
					
					System.out.println("Qual a classe do animal ? ");
					especie = ler.next();
					animal.setEspecie(especie);
					System.out.println("Qual o nome do animal ? ");
					nome = ler2.next();
					animal.setNome(nome);
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
					contPonto+= 10;
					
					break;
				case 2:
					
					System.out.println("Digite o nome do animal deseja remover ");
					remover = ler.next();
					animal.Remover(remover, list);
					if(contPonto<0) {
						contPonto = 0;
					} else {

						contPonto-= 10;
						
					}
					break;
				case 3:
					System.out.println("\n\t"+"Animais ");
					for(int i = 0; i<list.size(); i++) {				
							System.out.println("\n" + "Classe: "+list.get(i).getEspecie() + " | "+
							"Nome: "+list.get(i).getNome() + " | " 
							+ "Origem: " + list.get(i).getOrigem() + " | " + "Tamanho: " + list.get(i).getTamanho() + " | "
							+ "Peso médio: " + list.get(i).getPesoMedio() + " | " + "Longevidade: " + list.get(i).getLongevidade() + " | \n");
										
					}
					break;
				case 4:
					animal.print();
					break;
				case 5:
					System.out.println("\nO seu número de pontos é: " + contPonto);
				}
				
			}while(op!=0);
		}
		catch(Exception erro){
			
			System.out.println("\n\tError");
			System.out.println("\n\tVocê digitou algo que não devia.");
			System.out.println("\n\t" + erro);
			
		}
		
		
	}
	
	
}

