package auto;

public class Autogui {

	public static void main(String[] args) {
		 Autocar carro = new Autocar("Toyota", "Hilux", 2016, "Branca", 2);
		 Autocar carro2 = new Autocar("Toyota", "Corolla", 2024, "Branco", 4);
		 Autocar carro3 = new Autocar("Toyota", "SW4 Diamond", 2024, "Branca", 4);
		 
		 Automotc moto = new Automotc("Honda", "CB", 2023, "Dourada", 300);
		 Automotc moto2 = new Automotc("Honda", "CG", 2023, "Preta", 160);
		 Automotc moto3 = new Automotc("Honda", "BROS", 2023, "Vermelho", 160);
		 
		 System.out.println("Informaçoẽs dos Carros:");
		 System.out.println(carro.descricao());
		 System.out.println(carro2.descricao());
		 System.out.println(carro3.descricao());
		 
		 System.out.println("Informaçoẽs das Motos:");
		 System.out.println(moto.descricao());
		 System.out.println(moto2.descricao());
		 System.out.println(moto3.descricao());


	}

}
