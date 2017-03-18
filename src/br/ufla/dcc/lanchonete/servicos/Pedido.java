package br.ufla.dcc.lanchonete.servicos;
import br.ufla.dcc.lanchonete.modelo.Produto;
import java.util.ArrayList;

public class Pedido {
    
    private String cliente;
    private int numeroPedido;
    private ArrayList<Produto> produtos;
    private float precoTotal;
    
    public Pedido (String cliente, int numeroPedido, ArrayList<Produto> produtos) {
        this.cliente = cliente;
        this.numeroPedido = numeroPedido;
        this.produtos = produtos;
    }
    
    public void addProduto(Produto pro) {
        this.produtos.add(pro);
    }
    
    public void removerUltimoProduto() {
        this.produtos.remove(produtos.size()-1);
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public float getPrecoTotal() {
        precoTotal = 0;
        for (Produto p : produtos) {
            precoTotal += p.getPreco();
        }
        return precoTotal;
    }
        
}
