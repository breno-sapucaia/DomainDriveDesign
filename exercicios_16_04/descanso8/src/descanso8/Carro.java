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
				+ "Metalica:"+ (this.cor.isCorMetalica() ? "sim":"não")+"\n"
				+ "Tem Air bag:"+ (this.airBag ? "sim":"não")+"\n"
				+ "Tem abs:" +(this.abs ? "sim":"não")+"\n"
				+ "Tem Direção Hidráulica:" + (this.direcaoHidraulica ? "sim":"não")+"\n"
				+ "Tem Ar condicionado?" + (this.arCondicionado ? "sim":"não")+"\n"
				+ "Preço R$:" + this.preco+"\n"
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
		System.out.println("Direção Hidráulica ? "+ this.direcaoHidraulica);
		System.out.println("Ar condicionado?"+ this.arCondicionado);
	}
	
}
