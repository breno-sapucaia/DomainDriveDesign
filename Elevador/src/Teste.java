
public abstract class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevador elevador = new Elevador();
		elevador.inicializa(3, 2);
		System.out.println(elevador.getAndarAtual());
		System.out.println(elevador.getNumPessoas());
		elevador.sobe();
		elevador.sobe();
		System.out.println(elevador.getAndarAtual());
		elevador.sobe();
	}

}
