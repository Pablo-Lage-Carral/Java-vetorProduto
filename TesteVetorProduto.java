package br.fiap.com.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorProduto {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double ValorTotal (Produto[] p, int i) {
		double total = 0;
		for(int c=0; c<i; c++) {
			total += p[c].getQuantidade() * p[c].getValor();
		}return total;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto[] objVetorProduto = new Produto[2];
		
		int indice = 0, resposta = 0;
		
		//String marca, int quantidade, double valor
		while (resposta == 0) {
			
			objVetorProduto[indice] = new Produto(texto("Digite a marca: "),
					inteiro("Digite a quantidade: "), decimal("Digite o valor: "));
			indice ++;
			resposta = JOptionPane.showConfirmDialog(null, "Adicionar mais produtos no carrinho?", 
					"Carrinho de Compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		for(int contador=0; contador<indice; contador++) {
			System.out.println("\n" + "Marca: " + objVetorProduto[contador].getMarca() + "\n" +
					"Quantidade: " + objVetorProduto[contador].getQuantidade() + "\n" +
					"Valor: " + objVetorProduto[contador].getValor());
		}
		System.out.println("\n" + "Valor Total: " + ValorTotal(objVetorProduto, indice));
		
		
		

	}

}
