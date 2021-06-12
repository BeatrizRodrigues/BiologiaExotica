package _AnimalExotico;

public class AveWilson extends  Animal{
public String VelocidadeVo;
public String tamanhoBI;

public AveWilson(String especie, String nomeCientífico,
Double pesoMedio, String classe, String longevidade,
String origem, String curiosidade, String habilidade) {
super(especie, nomeCientífico, pesoMedio, classe, longevidade, origem); 

this.VelocidadeVo = VelocidadeVo;
this.tamanhoBI = tamanhoBI;
}

public String getVelocidadeVo() {
	return VelocidadeVo;
}

public void setVelocidadeVo(String velocidadeVo) {
	VelocidadeVo = velocidadeVo;
}

public String getTamanhoBI() {
	return tamanhoBI;
}

public void setTamanhoBI(String tamanhoBI) {
	this.tamanhoBI = tamanhoBI;
}

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
