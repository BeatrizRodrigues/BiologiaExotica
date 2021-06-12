package _AnimalExotico;

import java.util.List;
import java.util.ArrayList;

public class Animal {

	private String tamanho;
	private String nomeCientifico;
	private String nome;
	private String pesoMedio;
	private String longevidade;
	private String origem; // (pais/estado)
	
	// Construtor
	
	public Animal() {}
	
	public Animal(String tamanho, String nomeCientifico, String nome,
			String  pesoMedio, String  longevidade, String origem) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.nomeCientifico = nomeCientifico;
		this.pesoMedio = pesoMedio;
		this.longevidade = longevidade;
		this.origem = origem;
	}
	

	// Get e Set 
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String especie) {
		this.tamanho = especie;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPesoMedio() {
		return pesoMedio;
	}

	public void setPesoMedio(String pesoMedio) {
		this.pesoMedio = pesoMedio;
	}

	public String  getLongevidade() {
		return longevidade;
	}

	public void setLongevidade(String  longevidade) {
		this.longevidade = longevidade;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	// Lista de Animais
	
	List<Animal> listAnimal = new ArrayList<Animal>();
	
	// Metodo add
	
	public void addAnimal(Animal animal) {
						
		listAnimal.add(animal);

	}
	
	// Metodo remover
	
	public void removeAnimal(Animal animal) {
		
		listAnimal.remove(animal);
		
	}
	
	public void printAnimal() {
		
		System.out.println("\n\tAs caracteristicas do seu Animal: " );
		
		for(int i = 0; i<listAnimal.size(); i++) {
			
			System.out.println(
					"\n\t" + listAnimal.get(i).getNome() + " "
					+ listAnimal.get(i).getNomeCientifico() + " "
					+ listAnimal.get(i).getOrigem() + " "
					+ listAnimal.get(i).getTamanho() + " "
					+ listAnimal.get(i).getPesoMedio() + " "
					+ listAnimal.get(i).getLongevidade()
					);
			
		}

	}

}