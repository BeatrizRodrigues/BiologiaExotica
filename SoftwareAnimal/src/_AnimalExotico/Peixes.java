package _AnimalExotico;

import java.util.ArrayList;
import java.util.Scanner;

import Animal.Peixe;

public class Peixes extends Animal {
	
	ArrayList<Peixe> list = new ArrayList<Peixe>();
	public String tipoAgua;
	
	public Peixe(String tamanho, String nomeCientifico, String nome,
			String  pesoMedio, String  longevidade, String origem, String tipoAgua) {
		
		super(tamanho, nomeCientifico, nome, pesoMedio, longevidade, origem);
		this.tipoAgua = tipoAgua;
	}
	
	
	public void armazenarDados(Peixe m) {
		list.add(m);
	}
	
	public void removerDados(Peixe n) {
		list.remove(n);
	}
	@Override
	public void imprimir() {
		System.out.println("Peixes: ");
		for(int i = 0; i<list.size(); i++) {				
				System.out.println(
					"\n\t" + "Nome: "+list.get(i).getNome() + " | "
					+ "Nome científico: " + list.get(i).getNomeCientifico() + " | "
					+ "Origem: " + list.get(i).getOrigem() + " | "
					+ "Tamanho: " + list.get(i).getTamanho() + " | "
					+ "Peso médio: " + list.get(i).getPesoMedio() + " | "
					+ "Longevidade: " + list.get(i).getLongevidade() + " | "
					+ "Tipo de água: " + list.get(i).getTipoAgua());
							
		}
	}

	public ArrayList<Peixe> getList() {
		return list;
	}

	public void setList(ArrayList<Peixe> list) {
		this.list = list;
	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

}
