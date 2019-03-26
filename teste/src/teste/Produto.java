package teste;

public class Produto {
	private String descricao;
	private double valor;
	private int codigo;
	private String marca;
	private double desconto;
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setDescricao(String pDescricao) {
		descricao = pDescricao;
	}
	
	public void setCodigo(int pCodigo) {
		codigo = pCodigo;
	}
	
	public void setMarca(String pMarca) {
		marca = pMarca;
	}
	
	public void setValor(double pValor) {
		valor = pValor;
	}
	
	public String getBasico() {
		return codigo +") "+ descricao;
	}
	
	public String getDetalheMarca() {
		return "A marca é: " + marca;
	}
	
	public String getDesconto() {
		return "O valor com 10% de desconto fica: R$" + (valor - valor * 0.1);
	}
	
	public String getValores() {
		return "o valor comum é " + valor + ", o valor com juros de 10% é " + (valor *1.1);
	}
	
	public void setBasico(int pCodigo, String pDescricao) {
		this.codigo = pCodigo;
		this.descricao = pDescricao;
	}
	
	public void setDesconto(double pValor) {
		this.valor = pValor * 0.9;
	}
	public void setAtualizar(double pValor, double pPorcentagem) {
		this.valor = pValor + (pValor * pPorcentagem/100);
	}
}
