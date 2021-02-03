package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValueInStock() {
		return preco * quantidade;
	}
	
	public void addProducts(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProducts(int quantidade) {
		this.quantidade -= quantidade;	
	}
	
	public String toString() {
		return nome
		+ ", $ "
		+ String.format("%.2f", preco)
		+ ", "
		+ quantidade
		+ " units, total: $ "
		+ String.format("%.2f", totalValueInStock());
	}

}
