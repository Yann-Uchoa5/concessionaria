	public class Carros {
	    private String marca;
	    private String modelo;
	    private int ano;
	    private String cor;
	    private int numeroPortas;

	    // Construtor
	    public Carros(String marca, String modelo, int ano, String cor, int numeroPortas) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	        this.numeroPortas = numeroPortas;
	    }

	    // Getters e Setters
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public int getAno() {
	        return ano;
	    }

	    public void setAno(int ano) {
	        this.ano = ano;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public int getNumeroPortas() {
	        return numeroPortas;
	    }

	    public void setNumeroPortas(int numeroPortas) {
	        this.numeroPortas = numeroPortas;
	    }

	    // Método para obter a descrição do carro
	    public String descricao() {
	        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Portas: " + numeroPortas;
	    }
	}


