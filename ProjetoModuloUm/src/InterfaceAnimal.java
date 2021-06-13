
public class InterfaceAnimal {
	private String especie;
	private String nome;
	private String nomeCientifico;
	private Double tamanho;	
	private Double pesoMedio;
	private Double velocidadeMaxima;
	private int longevidade;
	private String origem;
	
	/*public InterfaceAnimal(String especie, String nome, String nomeCientifico, Double tamanho,
			Double  pesoMedio, Double velocidadeMaxima, int  longevidade, String origem) {
		super();
		this.especie = especie;
		this.nome = nome;
		this.nomeCientifico = nomeCientifico;
		this.tamanho = tamanho;		
		this.pesoMedio = pesoMedio;
		this.velocidadeMaxima = velocidadeMaxima;
		this.longevidade = longevidade;
		this.origem = origem;
	}*/
	
	public InterfaceAnimal() {
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

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
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
	
	//Metodos
	/*abstract void imprimir();
	abstract void removerDados(String n);
	abstract void armazenarDados(Animal m);*/

}
