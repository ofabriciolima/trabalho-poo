package br.ufla.dcc.lanchonete.modelo;

import java.util.Arrays;

/**
 * Implementação da classe Funcionário.
 * 
 * @author Fabricio, Matheus e Priscilla
 */
public class Funcionario {
    private String nome;
    private String login;
    private char[] senha;

    /**
     * Constrói um funcionário a partir do nome, login e senha.
     * 
     * @param nome Nome do funcionário.
     * @param login Login do funcionário.
     * @param senha Senha de autenticação do funcionário.
     */
    public Funcionario(String nome, String login, char[] senha) {
        this.nome = nome;
        this.login = login;
        this.senha = Arrays.copyOf(senha, senha.length);
    }
    
    /**
     * Constrói um funcionário a partir do Login e Senha.
     * 
     * @param login Login do funcionário.
     * @param senha Senha de autenticação do funcionário.
     */
    public Funcionario(String login, char[] senha) {
        this("", login, senha);
    }
   
    /**
     * Retorna o nome do funcionário.
     * 
     * @return Nome do funcionário. 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o Login do funcionário.
     * 
     * @return Login do funcionário. 
     */
    public String getLogin() {
        return login;
    }

    /**
     * Retorna a senha de autenticação do funcionário.
     * 
     * @return Senha do funcionário. 
     */
    public char[] getSenha() {
        return senha;
    }
    
}
