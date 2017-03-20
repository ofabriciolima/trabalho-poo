package br.ufla.dcc.lanchonete.util;

import javax.swing.JOptionPane;

/**
 * Classe Utilitária com métodos estáticos para exibição de caixas de mensagens.
 * 
 * @author Paulo Jr. e Julio Alves
 * @author Fabricio, Matheus e Priscilla
 */
public class Utilidades {

    /**
     * Exibe uma caixa de mensagem de informação com a mensagem passada.
     * 
     * @param mensagem String que representa a chave da mensagem. 
     */
    public static void msgInformacao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Exibe uma caixa de mensagem de erro com a mensagem passada.
     * 
     * @param mensagem String que representa a chave da mensagem.
     */
    public static void msgErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
