package _AnimalExotico;

public abstract class Animal {

	

	
	
	
	// Atributo
	
<<<<<<< HEAD
	protected String nome;
	protected Double pesoMedio;
	protected String classe;
	protected String longevidade;
	protected String origem;
=======
	public String especie;
	public String nomeCientífico;
	public Double pesoMedio;
	public Double velocidadeMaxima;
	public String longevidade;
	public String origem; // (pais/estado)
>>>>>>> f7a05d02bc2209d90e08fea03626251cb05f738e
	
	// Construtor
	
	public Animal(String especie, String nomeCientífico,
<<<<<<< HEAD
			Double pesoMedio, String classe,
			String longevidade, String origem) 
	{
			super();
			this.nome = nome;
			this.pesoMedio = pesoMedio;
			this.classe = classe;
			this.longevidade = longevidade;
			this.origem = origem;
=======
			Double pesoMedio, Double velocidadeMaxima,
			String longevidade, String origem) {
		super();
		this.especie = especie;
		this.nomeCientífico = nomeCientífico;
		this.pesoMedio = pesoMedio;
		this.velocidadeMaxima = velocidadeMaxima;
		this.longevidade = longevidade;
		this.origem = origem;
>>>>>>> f7a05d02bc2209d90e08fea03626251cb05f738e
	}
	
	// Metodos
	
	abstract public void especie(String especie);
	abstract public void nomeCientífico(String nomeCientífico);
	abstract public void pesoMedio(String pesoMedio);
	abstract public void velocidadeMaxima(Double velocidadeMaxima);
	abstract public void longevidade(String Longevidade);
	abstract public void origem(String origem);
	
	abstract public void Add();
	abstract public void Mostrar();
	abstract public void Alterar();
	


}
