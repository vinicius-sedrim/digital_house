
public abstract class Lanche {
	
	private double preco;
	private int tempo;
	
	
	
	public double getPreco() {
		return this.preco = preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getTempo(int valor) {
		return tempo*10+ valor;
	}
	
	public void setTempo(int distancia) {
		this.tempo = distancia;
	}

	abstract void setIngredientes(String[] ingredientes);


	
	

	
	
	
	
	

}
