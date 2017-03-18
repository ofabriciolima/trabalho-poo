package br.ufla.dcc.lanchonete.servicos;

import br.ufla.dcc.lanchonete.dao.DadosDAO;
import br.ufla.dcc.lanchonete.dao.lista.DadosDAOLista;
import br.ufla.dcc.lanchonete.modelo.Funcionario;
import br.ufla.dcc.lanchonete.seguranca.SessaoFuncionario;

/**
 * Classe que representa a camada de negócios de cadastro de usuários. Permite
 * cadastrar e autenticar um usuário.
 * 
 * @author Paulo Jr. e Julio Alves
 */
public class GerenciadorFuncionarios {

    // atributo utilizado como camada de acesso a dados do cadastro de usuários
    private final DadosDAO repositorioFuncionario;
    // atributo para controle de sessão (autenticação do usuário)
    private final SessaoFuncionario sessaoFuncionario;

    /**
     * Constroi o gerenciador de usuários, inicializando as camadas de acesso a 
     * dados e de sessão.
     */
    public GerenciadorFuncionarios() {
        repositorioFuncionario = DadosDAOLista.obterInstancia();
        sessaoFuncionario = SessaoFuncionario.obterInstancia();
    }

    /**
     * Tenta autenticar o usuário passado no sistema.
     * 
     * @param usuario Usuário a ser autenticado
     * @throws Exception Exceção gerada caso o usuário não possa ser autenticado,
     * ou seja, usuário não existe ou senha incorreta.
     */
    public void autenticarFuncionario(Funcionario funcionario) throws Exception {
        Funcionario funcionarioCadastrado = repositorioFuncionario.obterFuncionarioPeloLogin(funcionario.getLogin());
        sessaoFuncionario.alterarFuncionario(funcionarioCadastrado, funcionario.getSenha());
    }

    /**
     * Cadastra o usuário passado no sistema.
     * 
     * @param usuario Usuário a ser cadastrado.
     * @throws Exception Exceção gerada caso o usuário já esteja cadastrado.
     */
    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        Funcionario ret = repositorioFuncionario.obterFuncionarioPeloLogin(funcionario.getLogin());
        if (ret != null) {
            throw new Exception("Erro: funcionário já cadastrado");
        }
        repositorioFuncionario.adicionarFuncionario(funcionario);
    }
    
}