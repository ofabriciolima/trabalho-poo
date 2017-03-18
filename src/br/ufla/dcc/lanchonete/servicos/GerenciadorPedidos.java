package br.ufla.dcc.lanchonete.servicos;

import br.ufla.dcc.lanchonete.dao.DadosDAO;
import br.ufla.dcc.lanchonete.dao.lista.DadosDAOLista;
import br.ufla.dcc.lanchonete.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {

    // atributo utilizado como camada de acesso a dados do cadastro de usuários
    private final DadosDAO repositorioPedido;

    public GerenciadorPedidos() {
        repositorioPedido = DadosDAOLista.obterInstancia();
    }

    public void abrirPedido(Pedido pedido) {
        repositorioPedido.adicionarPedido(pedido);
    }
    
    public void removerPedido (Pedido pedido) {
        repositorioPedido.removerPedido(pedido);
    }
    
    public List<Produto> getListaLanches() {
        return repositorioPedido.getListaLanches();
    }
    
    public List<Produto> getListaBebidas() {
        return repositorioPedido.getListaBebidas();
    }
    
    public List<Pedido> getListaPedidos() {
        return repositorioPedido.getListaPedidos();
    }
    
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
