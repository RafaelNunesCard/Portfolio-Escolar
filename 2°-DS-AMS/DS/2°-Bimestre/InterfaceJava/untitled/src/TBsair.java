import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TBsair implements ActionListener {
    Inicial segundaJanela;

    public TBsair(Inicial janela) {
        segundaJanela = janela;
    }

    public void actionPerformed(ActionEvent e) {
        int status = JOptionPane.showConfirmDialog(
                null,
                "Deseja Realmente " + "Fechar o Programa?",
                "Mensagem de Saida",
                JOptionPane.YES_NO_OPTION
        );
        if (status == JOptionPane.YES_OPTION) {
            segundaJanela.setVisible(false);
            segundaJanela.dispose();
        }
    }
}
