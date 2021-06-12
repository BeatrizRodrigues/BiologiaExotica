package _AnimalExotico;

public abstract class Animal {

	

	
	
	
	// Atributo
	
	protected String nome;
	protected Double pesoMedio;
	protected String classe;
	protected String longevidade;
	protected String origem;
	
	// Construtor
	
	public Animal(String especie, String nomeCientífico,
			Double pesoMedio, String classe,
			String longevidade, String origem) 
	{
			super();
			this.nome = nome;
			this.pesoMedio = pesoMedio;
			this.classe = classe;
			this.longevidade = longevidade;
			this.origem = origem;
	}
	
	// Metodos
	
	abstract public void especie(String especie);
	abstract public void nomeCientífico(String nomeCientífico);
	abstract public void pesoMedio(String pesoMedio);
	abstract public void classe(String classe);
	abstract public void longevidade(String Longevidade);
	abstract public void origem(String origem);
	
	abstract public void Add();
	abstract public void Mostrar();
	abstract public void Alterar();
	


}
