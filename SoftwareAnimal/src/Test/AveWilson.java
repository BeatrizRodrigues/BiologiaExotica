package Test;

public class AveWilson extends Animal {
public String velocidadeVo;
public String  tamanhoBico;

public AveWilson(String especie, String nomeCientífico,
		Double pesoMedio, String classe, String longevidade,
		String origem, String curiosidade, String habilidade) {
	super(especie, nomeCientífico, pesoMedio, classe, longevidade, origem);
	
	this.velocidadeVo = velocidadeVo;
	this.tamanhoBico = tamanhoBico;	
}

public String getVelocidadeVo() {
	return velocidadeVo;
}

public void setVelocidadeVo(String velocidadeVo) {
	this.velocidadeVo = velocidadeVo;
}

public String getTamanhoBico() {
	return tamanhoBico;
}

public void setTamanhoBico(String tamanhoBico) {
	this.tamanhoBico = tamanhoBico;
}

}