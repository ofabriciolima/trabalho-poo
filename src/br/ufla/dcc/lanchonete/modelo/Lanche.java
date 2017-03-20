package br.ufla.dcc.lanchonete.modelo;
/**
 * Implementação da subclasse Lanche.
 * 
 * @author Fabricio, Matheus e Priscilla
 */
public class Lanche extends Produto {

    /**
     * Constrói um Lanche a partir de seu nome, preço e detalhes passados.
     * 
     * @param nome Nome do lanche.
     * @param preco Preço do lanche.
     * @param detalhes Detalhes do lanche.
     */
    public Lanche(String nome, double preco, String detalhes) {
        super(nome, preco, detalhes);
    }
    
}
