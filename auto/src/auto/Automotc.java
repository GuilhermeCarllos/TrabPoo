package auto;

public class Automotc {
	String modelo, marca, cor;
	int ano, cilin;
	
	public Automotc() {}
	
	
	public Automotc(String marca, String modelo, int ano, String cor, int cilin) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.cilin = cilin;
    }
    
    String descricao() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Cilindradas: " + cilin;
    }

}
