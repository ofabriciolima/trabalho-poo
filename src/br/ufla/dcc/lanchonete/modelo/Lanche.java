package br.ufla.dcc.lanchonete.modelo;

public class Lanche extends Produto {
    private String ingredientes;

    public Lanche(String nome, double preco, String detalhes) {
        super(nome, preco, detalhes);
    }
    
}
