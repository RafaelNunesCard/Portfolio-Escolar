import javax.swing.*;
import java.awt.*;

public class ExemploBotaoSair extends JFrame {
    JButton botao;

    public ExemploBotaoSair() {
        super("Botao Sair");
        Container tela = getContentPane();
        tela.setLayout(null);

        botao = new JButton("Sair");
        botao.setBounds(100, 50, 100, 20);
        botao.setToolTipText("Botão que finaliza a Janela");
        tela.add(botao);
        botao.addActionListener(e -> {
            int opcao;
            opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
