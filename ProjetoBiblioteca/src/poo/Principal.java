package poo;

public class Principal {

	public static void main(String[] args) {

		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmrpestimo("18/05/2022");
		emprestimo.setHoraEmprestimo("8:30 PM");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Felipe Henrique");
		
		Livro livro = new Livro();
		livro.setTitulo("O pequeno príncipe");
		
		emprestimo.setUsuario(usuario);
		emprestimo.setLivro(livro);
		
		System.out.println("-----EMPRÉSTIMO-----");
		System.out.println("Nome do livro:"+ emprestimo.getLivro() .getTitulo());
		System.out.println("Nome do usuario:"+ emprestimo.getUsuario().getNome());
		System.out.println("Data do empréstimo:"+ emprestimo.dataEmprestimo);
		System.out.println("Hora do empréstimo:"+ emprestimo.horaEmprestimo);
		livro.aberto();
		usuario.lerLivro();
		livro.fechado();
		emprestimo.setDevolverLivro(true);	
	}
}
