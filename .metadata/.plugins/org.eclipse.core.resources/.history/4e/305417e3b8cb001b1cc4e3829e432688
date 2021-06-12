package _AnimalExotico;

import java.util.ArrayList;
import java.util.List;

public class Insetos extends Animal implements InterfaceAnimal{

	// Atributos
	
	public String curiosidade;
	public String habilidade;
	public Animal animal;
	
	// Construtor
	
	public Insetos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Insetos(Animal animal, String tamanho, String nomeCientifico, String name, String pesoMedio, String longevidade,
			String origem) {
		super(tamanho, nomeCientifico, name, pesoMedio, longevidade, origem);
		// TODO Auto-generated constructor stub
		
		this.curiosidade = curiosidade;
		this.habilidade = habilidade;
		this.animal = animal;
		
	}
	
	// Métodos para polimorfismo.
	
	@Override
	public void especie(String tamanho) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nomeCientifico(String nomeCientifico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesoMedio(String pesoMedio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void longevidade(String Longevidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void origem(String origem) {
		// TODO Auto-generated method stub
		
	}
	
	// Get e Set

	public String getCuriosidade() {
		return curiosidade;
	}

	public void setCuriosidade(String curiosidade) {
		this.curiosidade = curiosidade;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	// Lista insetos
	
	List<Insetos> listInsetos = new ArrayList<Insetos>();
	
	// Metodo add
	
	public void addInsetos(Insetos animal) {
						
		listInsetos.add(animal);

	}
	
	// Metodo remover
	
	public void removeInsetos(Insetos animal) {
		
		listInsetos.remove(animal);
		
	}
	
	public void printInsetos() {
		
		System.out.println("\n\tCuriosidades e abilidades: " );
		
		for(Insetos printInsetos: listInsetos) {
			
			System.out.println(printInsetos.getCuriosidade() + " "
					+ printInsetos.getHabilidade());
			
		}

	}
	
}
