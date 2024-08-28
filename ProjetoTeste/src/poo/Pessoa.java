package poo;

public class Pessoa {
	
	String nome;
	String corCabelo;
	String biotipo;
	int idade;
	Carro carro;
	
	//Construtor
	Pessoa(){
		
	}
	
	Pessoa(String nome, String corCabelo, String biotipo, int idade){
		this.nome = nome;
		this.corCabelo = corCabelo;
		this.biotipo = biotipo;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	
	public String getCorCabelo() {
		return corCabelo;
	}
	
	public void setBiotipo(String biotipo) {
		this.biotipo = biotipo;
	}
	
	public String getBiotipo() {
		return biotipo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	void ligarCarro() {
		carro.ligar();
	}
	
	void desligarCarro() {
		carro.desligar();
	}
	
	void acelerarCarro() {
		carro.acelerar();
	}
	
	void frearCarro() {
		carro.frear();
	}
	
	void setCambioMarcha(int marcha) {
		carro.setCambio(marcha);
	}
	
}
