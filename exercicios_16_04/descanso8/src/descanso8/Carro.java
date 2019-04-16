package descanso8;

public class Carro {
	public String nome;
	public String modelo;
	public String fabricante;
	public int anoFabricacao;
	public Cor cor;
	public boolean airBag;
	public boolean abs;
	public boolean direcaoHidraulica;
	public boolean arCondicionado;
	public double preco;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void exibirTudo() {
		System.out.println("Nome:"+ this.nome+"\n"
				+ "Modelo:" + this.modelo + "\n"
				+ "Fabricante:"+ this.fabricante +"\n"
				+ "Ano Fabricado:"+ this.anoFabricacao +"\n"
				+ "Cor:" + this.cor.getNome()+"\n"
				+ "Metalica:"+ (this.cor.isCorMetalica() ? "sim":"n�o")+"\n"
				+ "Tem Air bag:"+ (this.airBag ? "sim":"n�o")+"\n"
				+ "Tem abs:" +(this.abs ? "sim":"n�o")+"\n"
				+ "Tem Dire��o Hidr�ulica:" + (this.direcaoHidraulica ? "sim":"n�o")+"\n"
				+ "Tem Ar condicionado?" + (this.arCondicionado ? "sim":"n�o")+"\n"
				+ "Pre�o R$:" + this.preco+"\n"
				+ "imposto R$:" + this.getImposto());
				
	}
	public double getICMS() {
		double icms = this.preco * 0.06;
		return icms;
	}
	public double getIPI() {
		double ipi = this.preco * 0.075;
		return ipi;
	}
	public double getImposto() {
		double imposto = this.getIPI() + this.getICMS();
		return imposto;
	}
	public void exibirOpcionais() {
		System.out.println("Metalica? "+ cor.isCorMetalica());
		System.out.println("AirBag? " + this.airBag);
		System.out.println("Abs? "+ this.abs);
		System.out.println("Dire��o Hidr�ulica ? "+ this.direcaoHidraulica);
		System.out.println("Ar condicionado?"+ this.arCondicionado);
	}
	
}
