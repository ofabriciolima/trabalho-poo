package br.ufla.dcc.lanchonete.modelo;

public abstract class Produto {
    String nome;
    private double preco;
    String detalhes;

    public Produto(String nome, double preco, String detalhes) {
        this.nome = nome;
        this.preco = preco;
        this.detalhes = detalhes;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDetalhes() {
        return detalhes;
    }
    
}
