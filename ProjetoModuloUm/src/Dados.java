import java.util.ArrayList;

public abstract class Dados {

	public String dadosAnimal;
	
	public Dados() {
		
		dadosAnimal = "\nPeixes:"
				+ "\n\tsão animais que possuem a pele coberta por escamas."
				+ "Sua respiração acontece de maneira aeróbica, através dos brônquios."
				+ "Exemplos dessa classe:"
				+ "tucunaré, lambari, bagre, pirarucu, sardinha, cação, peixe-beta, tubarão."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nAnfíbios:"
				+ "\n\tapresentam pele lisa, úmida, sem pelos, nem escamas."
				+ "Assim como os peixes, sua respiração é bronquial na fase larval."
				+ "Quando crescem, sua respiração passa a ser pulmonar. Exemplos de anfíbios:"
				+ "sapo, salamandra, rã, tritão."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nRépteis:"
				+ "\n\ta pele desses animais é coberta por escamas."
				+ "Outra característica importante é serem pecilotérmicos,"
				+ "que consiste na incapacidade de regular a temperatura do próprio corpo."
				+ "A respiração deles é feita através dos pulmões. Exemplos dessa categoria:"
				+ "tartarugas, cobras, serpentes, jacarés e iguanas."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nAves:"
				+ "\n\tseu corpo é coberto por penas e também possuem patas e asas."
				+ "Nem todos conseguem voar. Diferente dos répteis, as aves são homeotérmicas,"
				+ "isto é, conseguem controlar a temperatura corporal."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nMamíferos:"
				+ "\n\tapresentam pelos em todo corpo."
				+ "No caso dessa classe, a fêmea que alimenta os filhotes com o leite de suas mamas."
				+ "Os seres humanos se encaixam nessa categoria."
				+ "Também respiram pelo pulmão e conseguem regular a temperatura dos seus corpos."
				+ "Exemplos de mamíferos: boi, cachorro, girafa, macaco, tamanduá,"
				+ "leão, onça, jaguatirica, baleia, lontra, hipopótamo, tigre, gato,"
				+ "urso, ariranha, etc. ";
	
	}
	
	public abstract void print();
	public abstract void Remover(String remover, ArrayList<ReinoAnimal> list2);

	public String getDadosAnimal() {
		return dadosAnimal;
	}

	public void setDadosAnimal(String dadosAnimal) {
		this.dadosAnimal = dadosAnimal;
	}

	
	
	
}
