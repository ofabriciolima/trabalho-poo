package br.ufla.dcc.lanchonete.dao.lista;

import br.ufla.dcc.lanchonete.dao.DadosDAO;
import br.ufla.dcc.lanchonete.modelo.*;
import br.ufla.dcc.lanchonete.servicos.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementação do Data Access Object (Padrão de Projeto) do Usuário através de
 * Lista em memória
 * 
 * @author Paulo Jr. e Julio Alves
 */
public class DadosDAOLista implements DadosDAO {

    // instância única da classe (Padrão de Projeto Singleton)
    private static DadosDAOLista instancia;
    
    // lista em memória dos usuários cadastrados
    private final List<Funcionario> listaFuncionarios;
    
    // lista em memória dos produtos cadastrados
    private final List<Produto> listaLanches;
    private final List<Produto> listaBebidas;
    
    // lista em memória dos pedidos cadastrados
    private final List<Pedido> listaPedidos;

    /**
     * Constrói o objeto já definindo 5 usuários padrões
     */
    private DadosDAOLista() {
        listaFuncionarios = new ArrayList<>();
        listaLanches = new ArrayList<>();
        listaBebidas = new ArrayList<>();
        listaPedidos = new ArrayList<>();

        // Cadastro de apenas um funcionario (convidado) para testes
        listaFuncionarios.add(new Funcionario("Convidado", "convidado", new char[]{'1', '2', '3'}));
        
        //Cadastro dos produtos
        listaLanches.add(new Lanche("X-Bacon", 11.0, "Hambúrguer, alface, tomate, batata palha, queijo, bacon"));
        listaLanches.add(new Lanche("X-Egg", 9.0, "Hambúrguer, alface, tomate, batata palha, queijo, ovo"));
        listaLanches.add(new Lanche("X-Frango", 10.0, "Hambúrguer, alface, tomate, batata palha, queijo, frango"));
        listaLanches.add(new Lanche("X-Salada", 8.0, "Hambúrguer, alface, tomate, batata palha, queijo"));
        listaLanches.add(new Lanche("X-Tudo", 12.0, "Hambúrguer, alface, tomate, batata palha, queijo, ovo, frango, bacon"));
        
        listaBebidas.add(new Bebida("Água", 2.0, "Garrafa 500ml"));
        listaBebidas.add(new Bebida("Cerveja", 5.0, "Long Neck"));
        listaBebidas.add(new Bebida("Refrigerante", 3.5, "Lata"));
        listaBebidas.add(new Bebida("Suco", 4.0, "Lata"));

    }

    /**
     * Retorna a instância única da classe (Padrão de Projeto Singleton)
     * 
     * @return A instância única da classe
     */
    public static DadosDAOLista obterInstancia() {
        if (instancia == null) {
            instancia = new DadosDAOLista();
        }
        return instancia;
    }

    /**
     * Retorna o usuário a partir de seu login
     * 
     * @param login Login do usuário a ser retornado.
     * @return Usuário correspondente ao login passado.
     */
    @Override
    public Funcionario obterFuncionarioPeloLogin(String login) {
        for (Funcionario u : listaFuncionarios) {
            if (login.equals(u.getLogin())) {
                return u;
            }
        }
        return null;
    }

    /**
     * Cadastra o usuário passado.
     * 
     * @param usuario Usuário a ser cadastrado.
     */
    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    @Override
    public void adicionarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }
    
    @Override
    public void removerPedido(Pedido pedido) {
        listaPedidos.remove(pedido);
    }
    
    
/*    public void removerUltimoItem(Pedido pedido) {
        listaPedidos.pedido.getProdutos();
    }
*/

    @Override
    public List<Produto> getListaLanches() {
        return listaLanches;
    }

    @Override
    public List<Produto> getListaBebidas() {
        return listaBebidas;
    }    

    @Override
    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
    
}