package br.ufla.dcc.lanchonete.servicos;

import br.ufla.dcc.lanchonete.dao.DadosDAO;
import br.ufla.dcc.lanchonete.dao.lista.DadosDAOLista;
import br.ufla.dcc.lanchonete.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a camada de negócios de cadastro de pedidos. Permite
 * cadastrar e gerenciar pedidos.
 *
 * @author Fabricio, Matheus e Priscilla
 */
public class GerenciadorPedidos {

    // atributo utilizado como camada de acesso a dados do cadastro de pedidos.
    private final DadosDAO repositorioPedido;

    /**
     * Constroi o gerenciador de pedidos, inicializando as camadas de acesso a 
     * dados e de sessão.
     */
    public GerenciadorPedidos() {
        repositorioPedido = DadosDAOLista.obterInstancia();
    }

    /**
     * Abre um novo pedido, adiconando ao atributo repositorioPedido um novo pedido.
     * 
     * @param pedido Pedido a ser aberto.
     */
    public void abrirPedido(Pedido pedido) {
        repositorioPedido.adicionarPedido(pedido);
    }
    
    /**
     * Remove um pedido, removendo do atributo repositorioPedido o pedido que deseja ser removido.
     * 
     * @param pedido Pedido a ser removido.
     */
    public void removerPedido (Pedido pedido) {
        repositorioPedido.removerPedido(pedido);
    }
    
    /**
     * Retorna a lista de lanches.
     * 
     * @return Lista de lanches.
     */
    public List<Produto> getListaLanches() {
        return repositorioPedido.getListaLanches();
    }
    
    /**
     * Retorna a lista de bebidas.
     * 
     * @return Lista de bebidas. 
     */
    public List<Produto> getListaBebidas() {
        return repositorioPedido.getListaBebidas();
    }
    
    /**
     * Retorna a lista de pedidos.
     * 
     * @return Lista de pedidos. 
     */
    public List<Pedido> getListaPedidos() {
        return repositorioPedido.getListaPedidos();
    }
    
    /**
     * Busca um pedido desejado e retorna os pedidos encontrados.
     * 
     * @param nomeCliente Nome do cliente.
     * @return Pedidos encontrados.
     */
    public List<Pedido> buscarPedidos(String nomeCliente) {
        List<Pedido> pedidosEncontrados = new ArrayList<>();
        for(Pedido p : getListaPedidos()) {
            if (p.getCliente().contains(nomeCliente)) {
                pedidosEncontrados.add(p);
            }
        }        
        return pedidosEncontrados;
    }
    
}
