import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TBSair implements ActionListener {
    Inicial segundaJanela;

    public TBSair(Inicial janela) {
        segundaJanela = janela;
    }

    public void actionPerformed(ActionEvent e) {
        int status = JOptionPane.showConfirmDialog(null,
                "Deseja realmente fechar" + " o programa?",
                "Mensagem de saída",
                JOptionPane.YES_NO_OPTION
        );
        if (status == JOptionPane.YES_OPTION) {
            segundaJanela.setVisible(false);
            segundaJanela.dispose();
        }
    }
}
