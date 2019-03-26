package teste;

public class ExerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto unomilho = new Produto();
		unomilho.setCodigo(45);
		unomilho.setDescricao("Fiat uno");
		unomilho.setValor(4000);
		unomilho.setMarca("Meu uno querido");
		System.out.println(unomilho.getCodigo());
		System.out.println(unomilho.getDescricao());
		System.out.println(unomilho.getValor());
		System.out.println(unomilho.getMarca());
		System.out.println(unomilho.getBasico());
		System.out.println(unomilho.getDetalheMarca());
		System.out.println(unomilho.getDesconto());
		System.out.println(unomilho.getValores());
		unomilho.setBasico(46, "Meu uno infernal");
		unomilho.setDesconto(1000);
		System.out.println(unomilho.getValor());
		unomilho.setAtualizar(10, 100);
		System.out.println(unomilho.getValor());
	}

}
