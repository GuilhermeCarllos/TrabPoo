package auto;

public class Autocar {
	String modelo, marca,cor;
	int ano, num_port;
	
	 
	 public Autocar(String marca, String modelo, int ano, String cor, int num_port) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	        this.num_port = num_port;
	    }
	 String descricao() {
	        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Portas: " + num_port;
	    }

}
