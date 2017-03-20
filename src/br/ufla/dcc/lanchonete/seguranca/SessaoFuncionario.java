package br.ufla.dcc.lanchonete.seguranca;

import br.ufla.dcc.lanchonete.modelo.Funcionario;
import java.util.Arrays;

/**
 * Classe responsável por controlar a sessão (autenticação) do funcionário no sistema
 * 
 * @author Paulo Jr. e Julio Alves
 */
public class SessaoFuncionario {
    // instância única da classe (Padrão de Projeto Singleton)
    private static SessaoFuncionario instancia;
    // funcionário autenticado
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
     * Retorna o funcionário atualmente logado.
     * 
     * @return O funcionário logado
     */
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    /**
     * Indica se existe algum funcionário logado.
     *
     * @return True se existe funcionário logado.
     */
    public boolean estahLogado() {
        return (this.funcionario != null);
    } 
   
    /**
     * Altera o funcionário atualmente logado, verificando sua senha.
     * 
     * @param funcionario Novo funcionário logado.
     * @throws Exception Exceção gerada caso o funcionário não possa ser autenticado,
     * ou seja, funcionário não existe ou senha incorreta.
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
     * Finaliza a sessão (não deixa nenhum funcionário logado).
     */
    public void invalidarSessao() {
        this.funcionario = null;
    }
}
