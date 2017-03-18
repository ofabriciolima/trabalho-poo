package br.ufla.dcc.lanchonete.modelo;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private String login;
    private char[] senha;

    public Funcionario(String nome, String login, char[] senha) {
        this.nome = nome;
        this.login = login;
        this.senha = Arrays.copyOf(senha, senha.length);
    }
    
    public Funcionario(String login, char[] senha) {
        this("", login, senha);
    }
   
    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public char[] getSenha() {
        return senha;
    }
    
}
