package auto;

public class Autogui {

	public static void main(String[] args) {
		 Autocar carro = new Autocar("Toyota", "Hilux", 2016, "Branca", 2);
		 Automotc moto = new Automotc("Honda", "CB", 2023, "Dourada", 300);
		 System.out.println("Descrição do Carro: " + carro.descricao());
		 System.out.println("Descrição da Moto: " + moto.descricao());

	}

}
