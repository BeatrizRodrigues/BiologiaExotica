package SoftwareAnimal;
import java.util.ArrayList;

public class ReinoAnimal extends Dados{
	
	private String especie;
	private String nome;
	private Double tamanho;	
	private Double pesoMedio;
	private Double velocidadeMaxima;
	private int longevidade;
	private String origem;
	
	public ReinoAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	//Getters and Setters

	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPesoMedio() {
		return pesoMedio;
	}	
	
	public void setPesoMedio(Double pesoMedio) {
		this.pesoMedio = pesoMedio;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getLongevidade() {
		return longevidade;
	}

	public void setLongevidade(int longevidade) {
		this.longevidade = longevidade;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	// Polimorfismo
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println(dadosAnimal);
		
	}

	
	@Override
	public void Remover(String remover, ArrayList<ReinoAnimal> list2) {
		
				
		// TODO Auto-generated method stub
		for(int i = 0; i < list2.size(); i++) {
			ReinoAnimal p = list2.get(i);
			if(p.getNome().equals(remover)) {
		
					list2.remove(p);

				System.out.println("Animal removido");
			} else {
				
				System.out.println("\nO nome do animal não bate com: " + list2.get(i).getNome());
											
			}
		}
		
	}

}
