package br.ufla.dcc.lanchonete.seguranca;

import br.ufla.dcc.lanchonete.modelo.Funcionario;
import java.util.Arrays;

/**
 * Classe responsável por controlar a sessão (autenticação) do usuário no sistema
 * 
 * @author Paulo Jr. e Julio Alves
 */
public class SessaoFuncionario {
    // instância única da classe (Padrão de Projeto Singleton)
    private static SessaoFuncionario instancia;
    // usuário autenticado
    private Funcionario funcionario;
    
    /**
     * A princípio construtor não faz nada
     */
    private SessaoFuncionario() {}
    
    /**
     * Retorna a instância única da classe (Padrão de Projeto Singleton)
     * 
     * @return A instância única da classe
     */
    public static SessaoFuncionario obterInstancia() {
        if (instancia == null) {
            instancia = new SessaoFuncionario();
        }
        return instancia;
    }
    
    /**
     * Retorna o usuário atualmente logado.
     * 
     * @return O usuário logado
     */
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    /**
     * Indica se existe algum usuário logado.
     *
     * @return True se existe usuário logado.
     */
    public boolean estahLogado() {
        return (this.funcionario != null);
    } 
   
    /**
     * Altera o usuário atualmente logado, verificando sua senha.
     * 
     * @param usuario Novo usuário logado.
     * @throws Exception Exceção gerada caso o usuário não possa ser autenticado,
     * ou seja, usuário não existe ou senha incorreta.
     */
    public void alterarFuncionario(Funcionario funcionario, char[] senha) throws Exception {        
        if (funcionario == null || !Arrays.equals(funcionario.getSenha(), senha)) {
            throw new Exception("Usuário ou senha incorretos");
        }
        else {
            this.funcionario = funcionario;
        }
    }
    
    /**
     * Finaliza a sessão (não deixa nenhum usuário logado).
     */
    public void invalidarSessao() {
        this.funcionario = null;
    }
}
