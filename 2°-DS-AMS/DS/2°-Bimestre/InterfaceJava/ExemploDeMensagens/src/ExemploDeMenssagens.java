import javax.swing.*;
import java.awt.*;

public class ExemploDeMenssagens extends JFrame {
    JButton erro, informacao, exclamacao, pergunta, nenhum;

    public ExemploDeMenssagens(){
        super("Exemplo de Menssagens");
        Container tela = getContentPane();
        tela.setLayout(null);
        erro = new JButton("Erro");
        informacao = new JButton("Informacao");
        exclamacao = new JButton("Exclamacao");
        pergunta = new JButton("Pergunta");
        nenhum = new JButton("Nenhum");

        erro.setBounds(30, 20, 130, 20);
        informacao.setBounds(30, 50, 130, 20);
        exclamacao.setBounds(30, 80, 130, 20);
        pergunta.setBounds(30, 110, 130, 20);
        nenhum.setBounds(30, 140, 130, 20);

        tela.add(erro);
        tela.add(informacao);
        tela.add(exclamacao);
        tela.add(pergunta);
        tela.add(nenhum);

        erro.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Você escolheu Erro",
                    "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE,
                    null
            );
        });
        informacao.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Você escolheu informação",
                    "Mensagem Informação",
                    JOptionPane.INFORMATION_MESSAGE,
                    null
            );
        });
        exclamacao.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Você escolheu Exclamacao",
                    "Mensagem de Exclamacao",
                    JOptionPane.WARNING_MESSAGE,
                    null
            );
        });
        pergunta.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Você escolheu Pergunta",
                    "Mensagem de Pergunta",
                    JOptionPane.QUESTION_MESSAGE,
                    null
            );
        });
        nenhum.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Você escolheu Nenhum",
                    "Mensagem",
                    JOptionPane.PLAIN_MESSAGE,
                    null
            );
        });

        setSize(300, 220);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
