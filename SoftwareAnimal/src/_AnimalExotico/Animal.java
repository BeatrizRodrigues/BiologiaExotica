package _AnimalExotico;

import java.util.List;

import Animal.Animal;

import java.util.ArrayList;

public class Animal {
	private String nome;
	private String tamanho;
	private String nomeCientifico;
	private String pesoMedio;
	private Double velocidadeMaxima;
	private String longevidade;
	private String origem;
	
	public Animal(String tamanho, String nomeCientifico, String nome,
			String  pesoMedio, String  longevidade, String origem) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.nomeCientifico = nomeCientifico;
		this.pesoMedio = pesoMedio;
		this.longevidade = longevidade;
		this.origem = origem;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public String getNomeCientifico() {
		return nomeCientifico;
	}


	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}


	public String getPesoMedio() {
		return pesoMedio;
	}


	public void setPesoMedio(String pesoMedio) {
		this.pesoMedio = pesoMedio;
	}


	public String getNomeCientífico() {
		return nomeCientifico;
	}
	public void setNomeCientífico(String nomeCientífico) {
		this.nomeCientifico = nomeCientífico;
	}
	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
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
	
	abstract void armazenarDados(Animal n);
	abstract void removerDados(Animal n);
	//abstract void atualizarDados(String n);
	abstract void imprimir();

}