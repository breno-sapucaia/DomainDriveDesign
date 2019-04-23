
public class Elevador {
	public int numPessoas;
	public int numAndares; // contando o 0
	public int capacidade;
	public int andarAtual;
	
	public void inicializa(int capacidade, int numAndares) {
		if(capacidade >0) {
			this.capacidade = capacidade;
		}else {
			System.out.println("Capacidade inválida");
		}
		if(numAndares >0) {
			this.numAndares = numAndares;
		}else {
			System.out.println("Numero de andares inválido");
		}
	}
	
	public void entra() {
		if(numPessoas < capacidade) {
			numPessoas++;
		}else {
			System.out.println("elevador cheio");
		}
	}
	
	public void sai() {
		
		if(numPessoas == 0) {
			System.out.println("elevador vazio");
		}else {
			numPessoas++;
		}
	}
	
	public void sobe() {
		if(andarAtual < numAndares) {
			andarAtual++;
		}else {
			System.out.println("Ultimo andar");
		}
	}
	
	public void desce() {
		if(andarAtual > 0) {
			andarAtual--;
		}else {
			System.out.println("Já está no térreo");
		}
	}
	// getter setters
	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

	public int getNumAndares() {
		return numAndares;
	}

	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	
	
}
