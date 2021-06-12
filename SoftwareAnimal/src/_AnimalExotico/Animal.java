package _AnimalExotico;

public abstract class Animal {

    // Atributo
    
    protected String especie;
    
    protected String nomeCientifico;
    
    protected String nome;
    
    protected Double pesoMedio;
    
    protected String longevidade;

    protected String origem; // (pais/estado)
    
    // Construtor
    
    public Animal(String especie, String nomeCientifico,
            Double pesoMedio,
            String longevidade, String origem) {
        super();
        this.especie = especie;
        this.nomeCientifico = nomeCientifico;
        this.pesoMedio = pesoMedio;
        this.longevidade = longevidade;
        this.origem = origem;
    }
    
    // Metodos
    
    abstract public void especie(String especie);
    abstract public void nomeCientifico(String nomeCientifico);
    abstract public void nome(String nome);
    abstract public void pesoMedio(String pesoMedio);
    abstract public void longevidade(String Longevidade);
    abstract public void origem(String origem);


}