

public class Principal {

	public static void main(String[] args) {

        // Criando uma instância de Carro
        Carros carro1 = new Carros("Toyota", "Corolla", 2020, "Preto", 4);

        // Chamando o método descricao() para exibir as informações do carro
        System.out.println("Descrição do Carro:");
        System.out.println(carro1.descricao());

        // Criando uma instância de Moto
        Motos moto1 = new Motos("Honda", "CB 500", 2019, "Azul", 500);

        // Chamando o método descricao() para exibir as informações da moto
        System.out.println("\nDescrição da Moto:");
        System.out.println(moto1.descricao());
    
	}

}
