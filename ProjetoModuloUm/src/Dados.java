import java.util.ArrayList;

public abstract class Dados {

	public String dadosAnimal;
	
	public Dados() {
		
		dadosAnimal = "\nPeixes:"
				+ "\n\ts�o animais que possuem a pele coberta por escamas."
				+ "Sua respira��o acontece de maneira aer�bica, atrav�s dos br�nquios."
				+ "Exemplos dessa classe:"
				+ "tucunar�, lambari, bagre, pirarucu, sardinha, ca��o, peixe-beta, tubar�o."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nAnf�bios:"
				+ "\n\tapresentam pele lisa, �mida, sem pelos, nem escamas."
				+ "Assim como os peixes, sua respira��o � bronquial na fase larval."
				+ "Quando crescem, sua respira��o passa a ser pulmonar. Exemplos de anf�bios:"
				+ "sapo, salamandra, r�, trit�o."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nR�pteis:"
				+ "\n\ta pele desses animais � coberta por escamas."
				+ "Outra caracter�stica importante � serem pecilot�rmicos,"
				+ "que consiste na incapacidade de regular a temperatura do pr�prio corpo."
				+ "A respira��o deles � feita atrav�s dos pulm�es. Exemplos dessa categoria:"
				+ "tartarugas, cobras, serpentes, jacar�s e iguanas."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nAves:"
				+ "\n\tseu corpo � coberto por penas e tamb�m possuem patas e asas."
				+ "Nem todos conseguem voar. Diferente dos r�pteis, as aves s�o homeot�rmicas,"
				+ "isto �, conseguem controlar a temperatura corporal."
				+ "\n----------------------------------------------------------------------------------------------"
				+ "\nMam�feros:"
				+ "\n\tapresentam pelos em todo corpo."
				+ "No caso dessa classe, a f�mea que alimenta os filhotes com o leite de suas mamas."
				+ "Os seres humanos se encaixam nessa categoria."
				+ "Tamb�m respiram pelo pulm�o e conseguem regular a temperatura dos seus corpos."
				+ "Exemplos de mam�feros: boi, cachorro, girafa, macaco, tamandu�,"
				+ "le�o, on�a, jaguatirica, baleia, lontra, hipop�tamo, tigre, gato,"
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
