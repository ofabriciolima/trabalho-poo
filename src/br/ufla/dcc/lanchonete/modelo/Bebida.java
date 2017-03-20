package br.ufla.dcc.lanchonete.modelo;

/**
 * Implementação da subclasse bebida.
 * 
 * @author Fabricio, Matheus e Priscilla
 */
public class Bebida extends Produto {

    /**
     * Constrói uma Bebida a partir do nome, preço e detalhes passados.
     * 
     * @param nome Nome da bebida.
     * @param preco Preço da bebida.
     * @param detalhes Tipo de envase (lata, garrafa, etc.)
     */
    public Bebida(String nome, double preco, String detalhes) {
        super(nome, preco, detalhes);
    }
    
}
