package br.ufla.dcc.lanchonete.dao;

import br.ufla.dcc.lanchonete.modelo.Funcionario;
import br.ufla.dcc.lanchonete.modelo.Produto;
import br.ufla.dcc.lanchonete.servicos.Pedido;
import java.util.List;

/**
 * Interface do Data Access Object (Padrão de Projeto) do Funcionário e do Pedido
 * 
 * @author Paulo Jr. e Julio Alves
 * @author Fabricio, Matheus e Priscilla
 */
public interface DadosDAO {
    /**
     * Retorna o Funcionário a partir de seu login
     * 
     * @param login Login do funcionário a ser retornado.
     * @return Funcionário correspondente ao login passado.
     */
    public Funcionario obterFuncionarioPeloLogin(String login);
    
    /**
     * Cadastra o funcionário passado.
     * 
     * @param funcionario Funcionário a ser cadastrado.
     */
    public void adicionarFuncionario(Funcionario funcionario);
    
    /**
     * Adiciona pedido.
     * 
     * @param pedido Pedido a ser adicionado.
     */
    public void adicionarPedido(Pedido pedido);
    
    /**
     * Remove pedido.
     * 
     * @param pedido Pedido a ser removido.
     */
    public void removerPedido(Pedido pedido);
    
    /**
     * Retorna a lista de lanches pre-definidos e armazenados.
     * 
     * @return ListaLanches Lista de lanches a ser retornada.
     */
    public List<Produto> getListaLanches();
    
    /**
     * Retorna a lista de bebidas pre-definidas e armazenadas.
     * 
     * @return ListaBebidas Lista de bebidas a ser retornada.
     */
    public List<Produto> getListaBebidas();
    
    /**
     * Retorna a lista de Pedidos.
     * 
     * @return ListaPedidos Lista de pedidos a ser retornada.
     */
    public List<Pedido> getListaPedidos();
    
}
