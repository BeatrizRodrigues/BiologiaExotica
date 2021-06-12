package _AnimalExotico;

public class Dados extends Animal implements InterfaceAnimal{
	
	// Inserir alguns Animais.
	
	// Atributos
	
	public String curiosidade;
	public String habilidade;
	
	// Construtor
	
	public Dados(String tamanho, String nomeCientifico, String name, String pesoMedio, String longevidade,
			String origem) {
		super(tamanho, nomeCientifico, name, pesoMedio, longevidade, origem);
		// TODO Auto-generated constructor stub
		
		this.curiosidade = curiosidade;
		this.habilidade = habilidade;
	}
	
	// Metodos porlimorficos

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

	@Override
	public void armazenarDados(Animal n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerDados(Animal n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirAnimal() {
		// TODO Auto-generated method stub
		
	}
	

}
