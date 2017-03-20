package br.ufla.dcc.lanchonete.modelo;

/**
 * Implementação da superclasse Produto.
 * 
 * @author Fabricio, Matheus e Priscilla
 */
public abstract class Produto {
    String nome;
    private double preco;
    String detalhes;

    /**
     * Constrói um produto a partir do seu nome, preço e detalhes.
     * 
     * @param nome Nome do produto.
     * @param preco Preço do produto.
     * @param detalhes Detalhes do produto.
     */
    public Produto(String nome, double preco, String detalhes) {
        this.nome = nome;
        this.preco = preco;
        this.detalhes = detalhes;
    }

    /**
     * Retorna o nome do produto.
     * 
     * @return Nome do produto.
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna o preço do produto.
     * 
     * @return Preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Retorna os detalhes do produto.
     * 
     * @return Detalhes do produto.
     */
    public String getDetalhes() {
        return detalhes;
    }
    
}
