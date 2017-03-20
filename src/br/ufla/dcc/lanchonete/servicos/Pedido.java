package br.ufla.dcc.lanchonete.servicos;
import br.ufla.dcc.lanchonete.modelo.Produto;
import java.util.ArrayList;

/**
 * Implementação da classe pedido.
 * 
 * @author Fabricio, Matheus e Priscilla
 */
public class Pedido {
    
    private String cliente;
    private int numeroPedido;
    private ArrayList<Produto> produtos;
    private float precoTotal;
    
    /**
     * Constrói um pedido a partir do nome do cliente, numero do pedido e lista de produtos.
     * 
     * @param cliente Nome do cliente.
     * @param numeroPedido Numero do pedido.
     * @param produtos Produtos do pedido.
     */
    public Pedido (String cliente, int numeroPedido, ArrayList<Produto> produtos) {
        this.cliente = cliente;
        this.numeroPedido = numeroPedido;
        this.produtos = produtos;
    }
    
    /**
     * Adiciona um produto ao pedido.
     * 
     * @param pro Produto a ser adicionado.
     */
    public void addProduto(Produto pro) {
        this.produtos.add(pro);
    }
    
    /**
     * Remove o último item adicionado ao pedido.
     */
    public void removerUltimoProduto() {
        this.produtos.remove(produtos.size()-1);
    }
    
    /**
     * Retorna o cliente do pedido.
     * 
     * @return Nome do cliente. 
     */
    public String getCliente() {
        return cliente;
    }
    
    /**
     * Retorna o número do pedido.
     * 
     * @return Número do pedido.
     */
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    /**
     * Retorna os produtos do pedido.
     * 
     * @return Produtos do pedido.
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    /**
     * Retorna o preço total do pedido.
     * 
     * @return Preço total.
     */
    public float getPrecoTotal() {
        precoTotal = 0;
        for (Produto p : produtos) {
            precoTotal += p.getPreco();
        }
        return precoTotal;
    }
        
}
