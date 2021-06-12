package _AnimalExotico;

import java.util.ArrayList;
import java.util.Scanner;

import Animal.Animal;

public class Peixes extends Animal implements InterfaceAnimal {
	Scanner ler = new Scanner(System.in);
	ArrayList<Animal> list = new ArrayList<Animal>();
	public String tipoAgua;
	
	public Peixe(String tamanho, String nomeCientifico, String nome,
			String  pesoMedio, String  longevidade, String origem, String tipoAgua) {
		
		super(tamanho, nomeCientifico, nome, pesoMedio, longevidade, origem);
		this.tipoAgua = tipoAgua;
	}
	
	@Override
	public void armazenarDados(Animal n) {
		list.add(n);
	}
	@Override
	public void removerDados(Animal n) {
		list.remove(n);
	}
	@Override
	public void imprimir() {
			for(int i = 0; i<list.size(); i++) {
				System.out.println("Peixes: ");
				System.out.println(
					"\n\t" + list.get(i).getNome() + " "
					+ list.get(i).getNomeCientifico() + " "
					+ list.get(i).getOrigem() + " "
					+ list.get(i).getTamanho() + " "
					+ list.get(i).getPesoMedio() + " "
					+ list.get(i).getLongevidade() + " " + tipoAgua);
							
		}
	}

}