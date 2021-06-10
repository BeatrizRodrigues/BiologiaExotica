package Test;

public class GlaucusAtlanticus extends Animal{
	
	// Atributo

	public String curiosidade;
	public String habilidade;
	
	// Construtor
	
	public GlaucusAtlanticus(String especie, String nomeCientífico,
			Double pesoMedio, String classe, String longevidade,
			String origem, String curiosidade, String habilidade) {
		super(especie, nomeCientífico, pesoMedio, classe, longevidade, origem);
		// TODO Auto-generated constructor stub
		
		this.curiosidade = curiosidade;
		this.habilidade = habilidade;
		
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


	// Abstrato


	@Override
	public void especie(String especie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nomeCientífico(String nomeCientífico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesoMedio(String pesoMedio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classe(String classe) {
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
	
	

}
