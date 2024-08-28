package poo;

public class Teste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setTipo("Esportivo");
		carro.setCor("Azul");
		carro.setPlaca("LLL-4444");
		carro.setNumPortas(2);
	
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Carlos");
		pessoa.setCorCabelo("Loiro");
		pessoa.setBiotipo("Gordo");
		pessoa.setIdade(25);
		
		carro.setDono(pessoa);
		
		pessoa.setCarro(carro);
		
		pessoa.ligarCarro();
		pessoa.setCambioMarcha(1);
		pessoa.getCarro() .getCambio();
		pessoa.acelerarCarro();
		
		System.out.println();
		
		pessoa.setCambioMarcha(2);
		pessoa.getCarro() .getCambio();
		pessoa.acelerarCarro();
		
		System.out.println();
		
		pessoa.setCambioMarcha(3);
		pessoa.getCarro() .getCambio();
		pessoa.acelerarCarro();
		
		System.out.println();
		
		pessoa.setCambioMarcha(2);
		pessoa.getCarro() .getCambio();
		pessoa.acelerarCarro();
		
		System.out.println();
		
		pessoa.ligarCarro();
		pessoa.setCambioMarcha(1);
		pessoa.getCarro() .getCambio();
		pessoa.acelerarCarro();

		System.out.println();
		
		pessoa.ligarCarro();
		pessoa.setCambioMarcha(0);
		pessoa.frearCarro();
		pessoa.desligarCarro();
		
		
		System.out.println("\n-----CARRO-----");
		System.out.println("Tipo:"+ carro.getTipo());
		System.out.println("Cor:"+ carro.getCor());
		System.out.println("Placa:"+ carro.getPlaca());
		System.out.println("Portas:"+ carro.getNumPortas());
		System.out.println("Dono:"+ carro.getDono() .getNome());
		System.out.println("-----CARACTERÍSTICAS DO DONO-----");
		System.out.println("Nome:"+ pessoa.getNome());
		System.out.println("Cor do cabelo:"+ pessoa.getCorCabelo());
		System.out.println("Biotipo:"+ pessoa.getBiotipo());
		System.out.println("Idade:"+ pessoa.getIdade());
	}

}
