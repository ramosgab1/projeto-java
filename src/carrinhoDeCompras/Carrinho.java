package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	// Variável de instância itens co tipo list ou seja itens contem objetos do tipo produto.  
	
	private List <Produto> itens; 
	
	// Criar o carrinho. 
	
	public Carrinho() {
		this.itens = new ArrayList<>(); 
	}
	
	public void adicionarItem(Produto produto) { 
		this.itens.add(produto); 
		System.out.println("Produto adicionado ao carrinho: " );
	}
	
	// Mostrar o carrinho
	
	public Carrinho(List<Produto> itens) {
		super();
		this.itens = itens;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public void mostrarCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Produto produto : itens) {
                System.out.println(produto.getNome() + " - R$" + produto.getPreco());
            }
        }
}
}
