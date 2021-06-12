package _AnimalExotico;

import java.util.ArrayList;

public abstract class Animal {

    // Atributos   
    protected String especie;   
    protected String nome;
    protected Double pesoMedio;
    protected String longevidade;
    protected String origem; // (pais/estado)
    
    
 
    // Construtor
    public Animal(String especie,
            Double pesoMedio, Double velocidadeMaxima,
            String longevidade, String origem)
    {
        super();
        this.especie = especie;
        this.pesoMedio = pesoMedio;
        this.longevidade = longevidade;
        this.origem = origem;
    }
    
    ArrayList <Animal> lista = new ArrayList();
    
    //Métodos
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
	public Double getPesoMedio() {
		return pesoMedio;
	}
	public void setPesoMedio(Double pesoMedio) {
		this.pesoMedio = pesoMedio;
	}
	public String getLongevidade() {
		return longevidade;
	}
	public void setLongevidade(String longevidade) {
		this.longevidade = longevidade;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
    
	
	public void adicionarNome(String nome)
	{
		this.setNome(nome);
	}
	public void adicionarEspecie(String especie)
	{
		this.setNome(nome);
	}
    
	public void AdicionarPeso(String peso)
	{
		this.setNome(nome);
	}
	public void Ad(String origem)
	{
		this.setNome(nome);
	}
	public void adicionarLong(String longevidade)
	{
		this.setNome(longevidade);
	}
	
    
    
 


}