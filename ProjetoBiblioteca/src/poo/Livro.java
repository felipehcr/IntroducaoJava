package poo;

public class Livro {
	
	//ATRIBUTOS
	String titulo;
	String autores;
	String editora;
	String edicao;
	String ano;
	int numFolhas;
	boolean emprestimo;
	
	//CONSTRUTOR
	Livro(){
		
	}
	
	Livro(String titulo, String autores, String editora, String edicao, int numFolhas, String ano, boolean emprestimo){
		 this.titulo = titulo;
		 this.autores = autores;
		 this.editora = editora;
		 this.edicao = edicao;
		 this.numFolhas = numFolhas;
		 this.ano = ano;
		 this.emprestimo = false;
	}
	
	//MÉTODOS: SETS E GETS
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public String getAutores() {
		return autores;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public String getEdicao() {
		return edicao;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getAno() {
		return ano;
	}

	public void setNumFolhas(int numFolhas) {
		this.numFolhas = numFolhas;
	}
	
	public int getNumFolhas() {
		return numFolhas;
	}
	
	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public boolean getEmprestimo() {
		return emprestimo;
	}
	
	void aberto() {
		System.out.println("Livro está aberto para a leitura.");
	}
	
	void fechado() {
		System.out.println("O livro está fechado.");
	}
	
}
