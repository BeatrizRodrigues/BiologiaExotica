package _AnimalExotico;

public interface InterfaceAnimal {
	
	// Metodos polimorfismo
	
	abstract public void especie(String tamanho);
	abstract public void nomeCientifico(String nomeCientifico);
	abstract public void nome(String nome);
	abstract public void pesoMedio(String pesoMedio);
	abstract public void longevidade(String Longevidade);
	abstract public void origem(String origem);
	
	// Metodos novos
	
	abstract public void armazenarDados(Animal n);
	abstract public void removerDados(Animal n);
	abstract public void imprimirAnimal();

}
