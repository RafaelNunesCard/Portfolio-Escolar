import javax.swing.*;
import java.awt.*;

public class ExemploInputDialog extends JFrame {
    JButton botao;
    String nome;
    JLabel rotulo;

    public ExemploInputDialog() {
        super("Exemplo de Input Dialog");
        Container tela = getContentPane();
        tela.setLayout(null);

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        rotulo = new JLabel("");
        botao = new JButton("Sair");

        rotulo.setBounds(10, 40, 350, 20);
        rotulo.setText("O nome digitado foi: " + nome.toUpperCase());
        botao.setBounds(100, 90, 100, 20);
        botao.setToolTipText("Botão que finaliza a Janela");
        tela.add(botao);
        tela.add(rotulo);
        botao.addActionListener(e -> {
            int opcao;
            Object[] botoes = {"Sim", "Não"};
            opcao = JOptionPane.showOptionDialog(
                    null,                // componente pai
                    "Deseja mesmo fechar essa janela?", // mensagem
                    "Fechar",                           // título
                    JOptionPane.YES_NO_OPTION,          // tipo de opção
                    JOptionPane.QUESTION_MESSAGE,       // ícone
                    null,                               // ícone customizado
                    botoes,                             // botões personalizados
                    botoes[0]                           // botão padrão (foco inicial)
            );
            if (opcao == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
