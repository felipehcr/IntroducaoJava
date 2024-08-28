package poo;

public class Usuario {
	
	//ATRINUTOS
	String nome;
	String sexo;
	String telefone;
	int idade;
	
	//CONSTRUTOR
	Usuario(){
		
	}
	
	Usuario(String nome, String sexo, String telefone, int idade){
		 this.nome = nome;
		 this.sexo = sexo;
		 this.telefone = telefone;
		 this.idade = idade;
	}
	
	//MÉTODOS: SETS E GETS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	void lerLivro() {
		System.out.println("O usuário "+ getNome() +" está lendo o livro.");
	}

}
