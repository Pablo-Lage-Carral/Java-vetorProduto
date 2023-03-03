package br.com.fiap.beans;

public class Produto {
	private String marca;
	private int quantidade;
	private double valor;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produto(String marca, int quantidade, double valor) {
		super();
		this.marca = marca;
		this.quantidade = quantidade;
		this.valor = valor;
	}



	//Getters Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
