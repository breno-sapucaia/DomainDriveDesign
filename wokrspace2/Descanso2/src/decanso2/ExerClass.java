package decanso2;

public class ExerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto chupim = new Produto();
		chupim.setCodigo(666);
		//chupim.codigo = 666;
		chupim.setDescricao("Chupim dos Diabos");
		//chupim.descricao = "Chupim dos Diabos";
		chupim.setMarca("Velho Barreiro");
		//chupim.marca = "Velho Barreiro";
		chupim.setValor(0.0);
		
		Produto irineu = new Produto();
		irineu.setCodigo(333);
		irineu.setDescricao ("Feh");
		irineu.setValor(-20.0); 
		irineu.setMarca("Gloria a Deux");
				
		Produto encosto = new Produto();
		encosto.setCodigo(40);
		encosto.setDescricao("coisa Ruim");
		encosto.setMarca("IEPG");
		encosto.setValor(10.0);
		
		System.out.println(chupim.getBasico());
		//System.out.print(chupim.codigo);
		//System.out.print(chupim.descricao);
		//System.out.print(chupim.marca);
		//System.out.print(chupim.valor);
	}

}
