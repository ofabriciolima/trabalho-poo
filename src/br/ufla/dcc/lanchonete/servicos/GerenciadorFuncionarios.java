package br.ufla.dcc.lanchonete.servicos;

import br.ufla.dcc.lanchonete.dao.DadosDAO;
import br.ufla.dcc.lanchonete.dao.lista.DadosDAOLista;
import br.ufla.dcc.lanchonete.modelo.Funcionario;
import br.ufla.dcc.lanchonete.seguranca.SessaoFuncionario;

/**
 * Classe que representa a camada de negócios de cadastro de funcionários. Permite
 * cadastrar e autenticar um funcionário.
 * 
 * @author Paulo Jr. e Julio Alves
 */
public class GerenciadorFuncionarios {

    // atributo utilizado como camada de acesso a dados do cadastro de funcionário.
    private final DadosDAO repositorioFuncionario;
    // atributo para controle de sessão (autenticação do funcionário)
    private final SessaoFuncionario sessaoFuncionario;

    /**
     * Constroi o gerenciador de funcionários, inicializando as camadas de acesso a 
     * dados e de sessão.
     */
    public GerenciadorFuncionarios() {
        repositorioFuncionario = DadosDAOLista.obterInstancia();
        sessaoFuncionario = SessaoFuncionario.obterInstancia();
    }

    /**
     * Tenta autenticar o funcionário passado no sistema.
     * 
     * @param funcionario Funcionário a ser autenticado
     * @throws Exception Exceção gerada caso o funcionário não possa ser autenticado,
     * ou seja, funcionário não existe ou senha incorreta.
     */
    public void autenticarFuncionario(Funcionario funcionario) throws Exception {
        Funcionario funcionarioCadastrado = repositorioFuncionario.obterFuncionarioPeloLogin(funcionario.getLogin());
        sessaoFuncionario.alterarFuncionario(funcionarioCadastrado, funcionario.getSenha());
    }

    /**
     * Cadastra o funcionário passado no sistema.
     * 
     * @param funcionario Funcionário a ser cadastrado.
     * @throws Exception Exceção gerada caso o funcionário já esteja cadastrado.
     */
    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        Funcionario ret = repositorioFuncionario.obterFuncionarioPeloLogin(funcionario.getLogin());
        if (ret != null) {
            throw new Exception("Erro: funcionário já cadastrado");
        }
        repositorioFuncionario.adicionarFuncionario(funcionario);
    }
    
}