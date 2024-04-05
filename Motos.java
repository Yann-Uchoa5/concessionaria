

	public class Motos {
	    private String marca;
	    private String modelo;
	    private int ano;
	    private String cor;
	    private int cilindradas;

	    // Construtor
	    public Motos(String marca, String modelo, int ano, String cor, int cilindradas) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	        this.cilindradas = cilindradas;
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

	    public int getCilindradas() {
	        return cilindradas;
	    }

	    public void setCilindradas(int cilindradas) {
	        this.cilindradas = cilindradas;
	    }

	    // Método para obter a descrição da moto
	    public String descricao() {
	        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Cilindradas: " + cilindradas;
	    }
	}


