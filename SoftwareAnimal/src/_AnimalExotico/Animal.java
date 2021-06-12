package _AnimalExotico;

public abstract class Animal {

	// Atributo
	
	public String especie;
	public String nomeCient�fico;
	public Double pesoMedio;
	 public Double velocidadeMaxima;
	public String longevidade;
	public String origem; // (pais/estado)
	
	// Construtor
	
	public Animal(String especie, String nomeCient�fico,
			Double pesoMedio,
			String longevidade, String origem) {
		super();
		this.especie = especie;
		this.nomeCient�fico = nomeCient�fico;
		this.pesoMedio = pesoMedio;
		this.velocidadeMaxima = velocidadeMaxima;
		this.longevidade = longevidade;
		this.origem = origem;
	}
	
	// Metodos
	
	abstract public void especie(String especie);
	abstract public void nomeCient�fico(String nomeCient�fico);
	abstract public void pesoMedio(String pesoMedio);
	abstract public void velocidadeMaxima(Double velocidadeMaxima);
	abstract public void longevidade(String Longevidade);
	abstract public void origem(String origem);


}
