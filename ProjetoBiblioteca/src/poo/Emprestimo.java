package poo;

public class Emprestimo {
	
	//ATRIBUTOS
	String dataEmprestimo;
	String horaEmprestimo;
	Livro livro;
	Usuario usuario;
	
	//CONSTRUTOR
	Emprestimo(){
		
	}
	
	Emprestimo(String dataEmprestimo, String horaEmprestimo){
		this.dataEmprestimo = dataEmprestimo;
		this.horaEmprestimo = horaEmprestimo;
	}
	
	//MÉTODOS: SETS E GETS
	public void setDataEmrpestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public void setHoraEmprestimo(String horaEmprestimo) {
		this.horaEmprestimo = horaEmprestimo;
	}
	
	public String getHoraEmprestimo() {
		return horaEmprestimo;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	void setDevolverLivro(boolean emprestimo) {
		livro.setEmprestimo(true);
		System.out.println("Livro devolvido com sucesso!");
	}
}
