package br.ufla.dcc.lanchonete.dao;

import br.ufla.dcc.lanchonete.modelo.Funcionario;
import br.ufla.dcc.lanchonete.modelo.Produto;
import br.ufla.dcc.lanchonete.servicos.Pedido;
import java.util.List;

/**
 * Interface do Data Access Object (Padrão de Projeto) do Usuário
 * 
 * @author Paulo Jr. e Julio Alves
 */
public interface DadosDAO {
    /**
     * Retorna o usuário a partir de seu login
     * 
     * @param login Login do usuário a ser retornado.
     * @return Usuário correspondente ao login passado.
     */
    public Funcionario obterFuncionarioPeloLogin(String login);
    
    /**
     * Cadastra o usuário passado.
     * 
     * @param usuario Usuário a ser cadastrado.
     */
    public void adicionarFuncionario(Funcionario funcionario);
    public void adicionarPedido(Pedido pedido);
    public void removerPedido(Pedido pedido);
    public List<Produto> getListaLanches();
    public List<Produto> getListaBebidas();
    public List<Pedido> getListaPedidos();
    
}
