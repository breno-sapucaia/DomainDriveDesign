package decanso2;

public class Produto {
	
	private String descricao;
	private double valor;
	private int codigo;
	private String marca;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

    public String getBasico() {
    	String retorno;
    	retorno = this.codigo + " " + this.descricao;
    	return retorno;
    }
}
